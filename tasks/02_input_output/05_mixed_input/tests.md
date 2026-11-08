# JAVA_02_05. Число и строка вместе — Тесты

## Компиляция и запуск

```bash
javac -encoding UTF-8 Main.java
printf '25\nAlice Smith\n' | java Main
```

Эталон:

```bash
javac -encoding UTF-8 Solution.java && java Solution
```

## Проверка вывода

| Вход | Результат | Команда | Пояснение |
| --- | --- | --- | --- |
| `25\nAlice Smith\n` | `Alice Smith: 25\n` | `printf '25\nAlice Smith\n' \| java Main` | Имя из двух слов |
| `5\nBob\n` | `Bob: 5\n` | `printf '5\nBob\n' \| java Main` | Простое имя |

## Проверка ловушки

Если забыть `sc.nextLine()` после `nextInt()`, вывод будет:

```text
: 25
```

Имя потеряется — именно это ловит автотест.

## Автотесты

```bash
bash run_tests2_5.sh
```