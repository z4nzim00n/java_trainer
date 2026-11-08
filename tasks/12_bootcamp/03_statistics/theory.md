# Разбор задания

## Чтение вещественных чисел

```java
Scanner sc = new Scanner(System.in);
sc.useLocale(Locale.US);
double[] a = new double[n];
for (int i = 0; i < n; i++) {
    a[i] = sc.nextDouble();
}
```

`useLocale(Locale.US)` важен: на русской Windows `nextDouble` по умолчанию ждёт запятую, а тесты подают точку.

## Три величины за один проход

```java
double min = a[0];
double max = a[0];
double sum = 0;
for (int i = 0; i < n; i++) {
    if (a[i] < min) min = a[i];
    if (a[i] > max) max = a[i];
    sum += a[i];
}
double avg = sum / n;
```

Инициализация первым элементом, а не нулём: все числа могут быть положительными или все отрицательными.

## Среднее

`sum / n` — вещественное деление, потому что `sum` имеет тип `double`. Если бы `sum` был `int`, пришлось бы писать `(double) sum / n`.

## Формат

```java
System.out.printf(Locale.US, "Min: %.2f\n", min);
```

`%.2f` — два знака после точки. Без `Locale.US` на русской системе разделителем станет запятая.

## Частые ошибки

| Ошибка | Что происходит |
| --- | --- |
| Нет `useLocale(Locale.US)` | Ошибка чтения `2.5` |
| `printf` без `Locale.US` | Вывод с запятой |
| `min = 0` | Неверно для положительных чисел |
| `sum` как `int` | Среднее обрезается |
| Забыть `\n` | Строки склеиваются |
