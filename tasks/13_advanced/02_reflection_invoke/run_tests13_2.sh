#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "greet Bob" $'Hello, Bob\n'
run_case "greet Alice" $'Hello, Alice\n'
run_case "square 7" $'49\n'
run_case "square 0" $'0\n'
run_case "square 12" $'144\n'
run_case_devnull ""

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
