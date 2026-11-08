#!/usr/bin/env bash
# scripts/lib.sh — общие функции для run_tests.sh во всех папках заданий.
# Кладётся один раз в корень репозитория, в scripts/lib.sh.
#
# Источник решения задаётся переменной SOURCE_FILE (по умолчанию Main.java):
#   SOURCE_FILE=Solution.java bash run_tests1_1.sh
# Имя главного класса выводится из имени файла: Main.java -> Main.
#
# Ожидаемый вывод в run_case — точные байты. Для переносов строк используй
# ANSI-C кавычки: run_case "2 2" $'4\n'  (println)  или  run_case "2 2" "4"  (print).
# Вывод программы нормализуется: \r\n -> \n (на Windows println печатает \r\n,
# на Linux/macOS в Школе 21 — \n; тесты работают одинаково на всех платформах).

# Портативный JDK из tools/ имеет приоритет над системным,
# чтобы проверка не зависела от того, что установлено в системе.
# Ищем tools/jdk-* вверх по дереву от расположения lib.sh — это работает
# и из scripts/, и из рабочих копий Your_tasks/попытка/уровень/задание/.
_LIB_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
_search="$_LIB_DIR"
while :; do
  for _jdk in "$_search"/tools/jdk-*; do
    if [ -d "$_jdk/bin" ]; then
      export PATH="$_jdk/bin:$PATH"
      break 2
    fi
  done
  _parent="$(dirname "$_search")"
  [ "$_parent" = "$_search" ] && break
  _search="$_parent"
done
unset _jdk _search _parent

SOURCE_FILE="${SOURCE_FILE:-Main.java}"
MAIN_CLASS="${SOURCE_FILE%.java}"
BUILD_DIR=".build"

# compile [доп. флаги javac]
# --release 8 — совместимость с Java 8 (версия Школы 21).
# -encoding UTF-8 — исходники с русскими комментариями.
# -Xlint:all,-serial,-options,-this-escape — все предупреждения как ошибки,
# кроме serialVersionUID, устаревания --release 8 и this-escape в конструкторах.
compile() {
  mkdir -p "$BUILD_DIR"
  javac --release 8 -Xlint:all,-serial,-options,-this-escape -Werror \
    -encoding UTF-8 -d "$BUILD_DIR" "$SOURCE_FILE" "$@"
}

# Внутренний помощник: сравнивает /tmp/actual.out с ожидаемым значением.
# Сравнение через файлы + cmp, чтобы не терять информацию о завершающем
# переносе строки.
_compare_and_report() {
  local label="$1" expected="$2"
  printf '%s' "$expected" > /tmp/expected.out
  if cmp -s /tmp/actual.out /tmp/expected.out; then
    echo "OK:   $label -> '$expected'"
  else
    echo "FAIL: $label -> получили '$(cat -A /tmp/actual.out)', ждали '$(cat -A /tmp/expected.out)'"
    FAILED=1
  fi
}

# run_case "вход" "ожидаемый_вывод" — вход подаётся через echo (добавляет \n)
run_case() {
  local input="$1" expected="$2"
  echo "$input" | java -cp "$BUILD_DIR" "$MAIN_CLASS" | tr -d '\r' > /tmp/actual.out || true
  _compare_and_report "'$input'" "$expected"
}

# run_case_noeol "вход" "ожидаемый_вывод" — вход БЕЗ завершающего \n
run_case_noeol() {
  local input="$1" expected="$2"
  printf '%s' "$input" | java -cp "$BUILD_DIR" "$MAIN_CLASS" | tr -d '\r' > /tmp/actual.out || true
  _compare_and_report "'$input' (без \\n)" "$expected"
}

# run_case_devnull "ожидаемый_вывод" — вход полностью пуст (EOF до первого символа)
run_case_devnull() {
  local expected="$1"
  java -cp "$BUILD_DIR" "$MAIN_CLASS" < /dev/null | tr -d '\r' > /tmp/actual.out || true
  _compare_and_report "(/dev/null)" "$expected"
}

# run_case_args "аргументы командной строки" "вход" "ожидаемый_вывод"
run_case_args() {
  local args="$1" input="$2" expected="$3"
  echo "$input" | java -cp "$BUILD_DIR" "$MAIN_CLASS" $args | tr -d '\r' > /tmp/actual.out || true
  _compare_and_report "args='$args' input='$input'" "$expected"
}