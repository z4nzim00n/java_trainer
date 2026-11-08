#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "Hello World" $'HELLO WORLD\nhello world\n'
run_case "java" $'JAVA\njava\n'
run_case "ABC" $'ABC\nabc\n'
run_case "Hello, World! 123" $'HELLO, WORLD! 123\nhello, world! 123\n'
run_case "" $'\n\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
