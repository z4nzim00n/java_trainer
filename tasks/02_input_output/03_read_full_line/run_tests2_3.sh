#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "Hello world" $'Hello world\n'
run_case "  spaced  " $'  spaced  \n'
run_case "a" $'a\n'
run_case_noeol "Hello world" $'Hello world\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi