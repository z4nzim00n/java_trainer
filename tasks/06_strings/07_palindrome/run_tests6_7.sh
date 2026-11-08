#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "Level" $'true\n'
run_case "A man a plan a canal Panama" $'true\n'
run_case "hello" $'false\n'
run_case "12321" $'true\n'
run_case "Hello, World!" $'false\n'
run_case "12345" $'false\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
