## JAVA_11_04. Пул потоков и Future

### Задание
| Java_11_04 ||
| ------ | ------- |
| **Темы:** | `ExecutorService`, `Callable`, `Future`, `get()`, `shutdown()`. |
| **Файл решения:** | Main.java |
| **Входные данные:** | Стандартный поток ввода (stdin) |
| **Выходные данные** | Стандартный поток вывода (stdout) |

Считай `N`, затем `N` целых чисел. Для каждого числа отправь в пул потоков задачу, которая возвращает **квадрат** числа, собери результаты и выведи их сумму.

```java
ExecutorService pool = Executors.newFixedThreadPool(2);
List<Future<Long>> futures = new ArrayList<>();
for (int i = 0; i < n; i++) {
    final int value = sc.nextInt();
    futures.add(pool.submit(new Callable<Long>() {
        @Override
        public Long call() {
            return (long) value * value;
        }
    }));
}
long sum = 0;
for (Future<Long> future : futures) {
    sum += future.get();
}
pool.shutdown();
System.out.println(sum);
```

`Callable` похож на `Runnable`, но умеет возвращать результат и бросать исключения. `Future` — «обещание» результата: `get()` блокируется, пока задача не завершится.

Гарантируется, что `1 <= N <= 1000`, числа помещаются в `int`.

### Примеры

| Входные данные | Результат работы |
| ------ | ------ |
| 3<br>1 2 3 | 14 |
| 1<br>5 | 25 |
| 4<br>-1 2 -3 4 | 30 |

### Как проверить

```bash
bash run_tests11_4.sh
```
