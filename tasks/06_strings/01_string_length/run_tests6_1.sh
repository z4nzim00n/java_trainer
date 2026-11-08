#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "Hello" $'5\n'
run_case "Hello, World!" $'13\n'
run_case "" $'0\n'
run_case "a b" $'3\n'
run_case "   " $'3\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
