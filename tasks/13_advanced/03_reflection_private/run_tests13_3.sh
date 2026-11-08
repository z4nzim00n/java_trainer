#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "secret42" $'Value: secret42\n'
run_case "hello world" $'Value: hello world\n'
run_case "" $'Value: \n'
run_case_devnull $'Value: \n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
