#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "Java 2024 Java 2024" $'Java (2024)\nequal\n'
run_case "Java 2024 Go 2019" $'Java (2024)\nnot equal\n'
run_case "Java 2024 Java 2020" $'Java (2024)\nnot equal\n'
run_case "Effective 2018 Effective 2018" $'Effective (2018)\nequal\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
