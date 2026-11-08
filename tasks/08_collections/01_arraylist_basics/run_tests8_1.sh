#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'3\n1 2 3' $'3\n1 2 3\n6\n'
run_case $'1\n5' $'1\n5\n5\n'
run_case $'4\n-1 0 1 2' $'4\n-1 0 1 2\n2\n'
run_case $'2\n10 20' $'2\n10 20\n30\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
