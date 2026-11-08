#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "  hello   world  " $'hello world\n'
run_case "a  b" $'a b\n'
run_case "one" $'one\n'
run_case "" $'\n'
run_case "     " $'\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
