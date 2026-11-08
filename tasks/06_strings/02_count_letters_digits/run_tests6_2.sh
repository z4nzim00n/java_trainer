#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "abc123" $'3 3\n'
run_case "Hello, World!" $'10 0\n'
run_case "2024" $'0 4\n'
run_case "a1 b2 c3" $'3 3\n'
run_case "!@#" $'0 0\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
