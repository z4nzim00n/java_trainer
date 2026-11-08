#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n3 -1 7 2 7' $'7\n'
run_case $'1\n-42' $'-42\n'
run_case $'3\n5 5 5' $'5\n'
run_case $'4\n-9 -1 -7 -3' $'-1\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
