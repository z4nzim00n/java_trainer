#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'3\n1 2 3' $'6\n2.00\n'
run_case $'4\n10 20 30 40' $'100\n25.00\n'
run_case $'1\n5' $'5\n5.00\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi