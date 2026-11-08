#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n1 2 3 4 5' $'5 4 3 2 1\n'
run_case $'1\n7' $'7\n'
run_case $'3\n-1 0 1' $'1 0 -1\n'
run_case $'4\n1 2 3 4' $'4 3 2 1\n'
run_case $'2\n8 9' $'9 8\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
