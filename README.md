# Java Trainer — путь с нуля до Java Bootcamp

Тренажёр по Java для новичка, который **не писал на Java вообще**.  
71 задание в 13 разделах: от `Hello, World` и `main` до коллекций, файлов,
потоков, задач вступительного Java Bootcamp Школы 21 и рефлексии.

Каждое задание самодостаточно: условие, компилируемый скелет, эталонное
решение, решение с комментариями, разбор теории, ручные тесты и bash-автотест.

---

## Быстрый старт

Нужен только bash (Git Bash на Windows) и JDK. Портативный JDK 21 уже лежит в
`tools/`, устанавливать ничего не нужно — `scripts/lib.sh` сам добавляет его в
`PATH`.

```bash
cd tasks/01_basics/01_hello_world
bash run_tests1_1.sh
```

Скелет `Main.java` пока ничего не печатает, поэтому тест упадёт — это нормально.
Открой `Main.java`, выполни `// TODO`, снова запусти тест. Когда тест пройден,
сравни своё решение с `Solution.java` и прочитай `SolutionCommented.java`.

Проверить эталон:

```bash
SOURCE_FILE=Solution.java bash run_tests1_1.sh
SOURCE_FILE=SolutionCommented.java bash run_tests1_1.sh
```

Проверить **весь** тренажёр (71 задание):

```bash
bash scripts/run_all.sh --solution
bash scripts/run_all.sh --commented
```

Ожидаемый результат — `Пройдено: 71/71`.

---

## Структура

```text
Java_trainer/
├── trainer.html                 # IDE и читалка заданий в браузере
├── trainer_theory_tests.html    # тесты по теории (99 вопросов)
├── tasks/                       # 13 разделов, 71 задание
│   └── <раздел>/<NN_имя>/
│       ├── README.md
│       ├── Main.java            # скелет для ученика
│       ├── Solution.java        # эталон
│       ├── SolutionCommented.java
│       ├── theory.md
│       ├── tests.md
│       └── run_testsN_M.sh
├── scripts/
│   ├── lib.sh                   # compile, run_case, поиск JDK
│   └── run_all.sh               # прогон всех автотестов
├── docs/
│   ├── task_format.md           # как устроено задание
│   ├── java_cheatsheet.md       # шпаргалка по Java 8
│   └── bootcamp_roadmap.md      # Day00–Day09 → разделы тренажёра
└── tools/                       # портативный Temurin JDK 21
```

Все решения компилируются с `--release 8 -Xlint:all -Werror`, то есть
тренажёр проверяет совместимость с Java 8, которая используется в Школе 21.

---

## Учебный путь

Разделы идут от простого к сложному. Внутри раздела задания тоже упорядочены.

| № | Раздел | Что освоишь | Заданий |
| --- | --- | --- | --- |
| 01 | Основы Java | структура класса, `main`, типы, вывод на экран | 6 |
| 02 | Ввод и вывод | `Scanner`, `nextInt`/`nextLine`, `printf` | 5 |
| 03 | Выражения | арифметика, целочисленное деление, приведение типов | 5 |
| 04 | Циклы | `while`, `for`, разбор цифр числа, накопление | 6 |
| 05 | Массивы | индексы, `length`, сортировка, перестановки | 6 |
| 06 | Строки | `String`, `StringBuilder`, `split`, символы | 8 |
| 07 | ООП | классы, конструкторы, `static`, наследование | 6 |
| 08 | Коллекции | `List`, `Map`, `Set`, `Iterator`, `Comparator` | 6 |
| 09 | Исключения | `try`/`catch`/`finally`, свои исключения | 4 |
| 10 | Файлы | `java.nio.file`, `Files`, кодировки, байты | 6 |
| 11 | Потоки | `Thread`, `Runnable`, `join`, `synchronized`, `ExecutorService` | 4 |
| 12 | Java Bootcamp | задачи в стиле Day00–Day03 | 6 |
| 13 | Advanced | рефлексия: поля, методы, приватный доступ | 3 |

### Задания по разделам

<details>
<summary><b>01. Основы Java</b></summary>

- `01_hello_world` — первая программа
- `02_fix_class_name` — исправь имя класса
- `03_fix_semicolons` — расставь точки с запятой
- `04_fix_main_signature` — исправь сигнатуру `main`
- `05_fix_types` — подбери типы переменных
- `06_variables_output` — переменные и вывод

Задания 02–05 — «найди и исправь ошибку»: `Main.java` намеренно не
компилируется, пока ошибка не исправлена. Остальные задания — «напиши с нуля»,
их скелет компилируется сразу.

</details>

<details>
<summary><b>02. Ввод и вывод</b></summary>

- `01_echo_number` — эхо числа
- `02_sum_two_numbers` — сумма двух чисел
- `03_read_full_line` — чтение строки целиком
- `04_formatted_output` — `printf` с точностью
- `05_mixed_input` — число и строка в одном вводе

</details>

<details>
<summary><b>03. Выражения и вычисления</b></summary>

- `01_circle_area` — площадь круга
- `02_radians_to_degrees` — радианы в градусы
- `03_swap_edge_digits` — перестановка крайних цифр
- `04_integer_division_trap` — ловушка целочисленного деления
- `05_boolean_expression` — логическое выражение

</details>

<details>
<summary><b>04. Циклы и последовательности</b></summary>

- `01_sequence_max` — максимум последовательности
- `02_sum_of_digits` — сумма цифр
- `03_max_digit` — максимальная цифра
- `04_odd_digits_product` — произведение нечётных цифр
- `05_reverse_number` — разворот числа
- `06_unpaired_number` — число без пары (XOR)

</details>

<details>
<summary><b>05. Массивы</b></summary>

- `01_array_sum_average` — сумма и среднее
- `02_min_max` — минимум и максимум
- `03_reverse_array` — разворот массива
- `04_remove_duplicates` — удаление дубликатов
- `05_bubble_sort` — пузырьковая сортировка
- `06_swap_max_min` — обмен максимума и минимума

</details>

<details>
<summary><b>06. Строки и символы</b></summary>

- `01_string_length` — длина строки
- `02_count_letters_digits` — буквы и цифры
- `03_to_upper_lower` — регистр
- `04_count_words` — количество слов
- `05_trim_spaces` — схлопывание пробелов
- `06_reverse_string` — разворот строки
- `07_palindrome` — палиндром
- `08_caesar_cipher` — шифр Цезаря

</details>

<details>
<summary><b>07. ООП: классы и объекты</b></summary>

- `01_first_class` — первый класс
- `02_getters_setters` — геттеры и сеттеры
- `03_constructor_overload` — перегрузка конструкторов
- `04_static_id_generator` — `static`-счётчик
- `05_tostring_equals` — `toString` и `equals`
- `06_inheritance` — наследование и полиморфизм

</details>

<details>
<summary><b>08. Коллекции</b></summary>

- `01_arraylist_basics` — `ArrayList`
- `02_hashmap_word_count` — `HashMap`
- `03_hashset_unique` — `HashSet`
- `04_sort_with_comparator` — `Comparator`
- `05_linkedlist_stack` — `Deque` как стек
- `06_iterator_remove` — удаление через `Iterator`

</details>

<details>
<summary><b>09. Исключения</b></summary>

- `01_safe_division` — деление без падения
- `02_input_validation` — проверка числа
- `03_custom_exception` — своё исключение
- `04_finally` — блок `finally`

</details>

<details>
<summary><b>10. Файлы и ввод-вывод</b></summary>

- `01_print_file` — прочитать файл
- `02_write_file` — записать файл
- `03_copy_file` — скопировать файл
- `04_sum_numbers_file` — сумма чисел из файла
- `05_count_words_file` — слова в файле
- `06_file_signature` — определение формата по сигнатуре

</details>

<details>
<summary><b>11. Многопоточность</b></summary>

- `01_thread_basics` — первый поток
- `02_two_threads` — два потока
- `03_synchronized_counter` — синхронизированный счётчик
- `04_executor_service` — пул потоков и `Future`

</details>

<details>
<summary><b>12. Задачи Java Bootcamp</b></summary>

- `01_prime_check` — простое число
- `02_coffee_machine` — кофемашина
- `03_statistics` — минимум, максимум, среднее
- `04_histogram` — гистограмма
- `05_rotate_array` — циклический сдвиг
- `06_matrix_sum` — сумма и максимум матрицы

</details>

<details>
<summary><b>13. Reflection и продвинутое</b></summary>

- `01_reflection_fields` — поля класса через рефлексию
- `02_reflection_invoke` — вызов метода через рефлексию
- `03_reflection_private` — доступ к приватному полю

</details>

---

## HTML-инструменты

### `trainer.html` — IDE и читалка

Открой файл в Chrome или Edge, нажми «Выбрать папку» и укажи папку
`Java_trainer` (ту, где лежит `tasks/`). Слева появится дерево разделов и
заданий. Для каждого задания доступны условие, теория, тесты, эталон и решение
с комментариями — с подсветкой синтаксиса Java.

Браузеру нужно разрешение на доступ к папке: страница работает через File
System Access API и ничего никуда не отправляет. Состояние редактора хранится в
IndexedDB локально.

### `trainer_theory_tests.html` — тесты по теории

99 вопросов по 12 темам: основы, ввод-вывод, выражения, циклы, массивы, строки,
ООП, коллекции, исключения, файлы, потоки, рефлексия. После каждого ответа —
разбор. Есть режим случайного набора вопросов из всех тем.

---

## Как проверяется задание

`scripts/lib.sh` компилирует `Main.java` (или файл из `SOURCE_FILE`) в `.build/`
и запускает программу с подготовленным вводом. Вывод сравнивается **побайтово**
через `cmp`, с нормализацией `\r\n` → `\n`, чтобы тесты одинаково работали на
Windows и Linux.

- `run_case "вход" $'ожидание\n'` — ввод через `echo`;
- `run_case_noeol` — ввод без завершающего перевода строки;
- `run_case_devnull` — пустой ввод (сразу EOF);
- `run_case_args` — аргументы командной строки.

Компиляция: `javac --release 8 -Xlint:all,-serial,-options,-this-escape -Werror`.
Поэтому решения обязаны быть чистыми по предупреждениям и совместимыми с Java 8.

---

## Если что-то не работает

| Симптом | Причина и решение |
| --- | --- |
| `javac: command not found` | Запускай тесты из папки задания через `bash run_testsN_M.sh`: скрипт сам найдёт `tools/jdk-*`. Если JDK нет — скачай Temurin 21 в `tools/`. |
| Тест ждёт `3.50`, а печатает `3,50` | Русская локаль. Используй `sc.useLocale(Locale.US)` и `System.out.printf(Locale.US, ...)`. |
| `\r` в выводе | Не запускай `java` напрямую в сравнении; `lib.sh` уже убирает `\r`. |
| `Main.java` не компилируется | Для заданий «исправь ошибку» это ожидаемо. Для остальных проверь сигнатуру `public static void main(String[] args)`. |
| Браузер не даёт выбрать папку | Нужен Chrome/Edge и открытие страницы как файла или через локальный сервер; Safari/Firefox File System Access API не поддерживают. |

---

## Что дальше

После раздела 13 смотри [docs/bootcamp_roadmap.md](docs/bootcamp_roadmap.md):
там сопоставление Day00–Day09 Java Bootcamp с разделами тренажёра и темы,
которые стоит изучать отдельно (JDBC, JUnit/Mockito, Spring, сокеты, Maven, JAR).
