#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'3\n1 2 3' $'14\n'
run_case $'1\n5' $'25\n'
run_case $'4\n-1 2 -3 4' $'30\n'
run_case $'2\n0 0' $'0\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
