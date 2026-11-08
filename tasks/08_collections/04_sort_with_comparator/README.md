## JAVA_08_04. Сортировка с Comparator

### Задание
| Java_08_04 ||
| ------ | ------- |
| **Темы:** | `Comparator`, `Collections.sort`, составной порядок, лямбды. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Считай `N`, затем `N` слов. Отсортируй их **по длине по возрастанию**, а при одинаковой длине — **по алфавиту**. Выведи слова через пробел в одной строке.

Порядок задаётся `Comparator`:

```java
Collections.sort(words, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
        if (a.length() != b.length()) {
            return a.length() - b.length();
        }
        return a.compareTo(b);
    }
});
```

`compare` возвращает отрицательное число, если `a` должен идти раньше `b`; ноль — если порядок безразличен; положительное — если позже.

Гарантируется, что `N >= 1`.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| 5<br>bbb a cc dd e | a e cc dd bbb |
| 3<br>apple fig kiwi | fig kiwi apple |
| 4<br>bb aa cc dd | aa bb cc dd |

### Как проверить

```bash
bash run_tests8_4.sh
```
