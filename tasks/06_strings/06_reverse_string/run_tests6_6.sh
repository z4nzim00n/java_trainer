#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "hello" $'olleh\n'
run_case "Java" $'avaJ\n'
run_case "12345" $'54321\n'
run_case "" $'\n'
run_case "ab" $'ba\n'
run_case "level" $'level\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
