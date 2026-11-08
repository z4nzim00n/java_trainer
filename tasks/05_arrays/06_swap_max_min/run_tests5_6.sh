#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\n3 9 1 7 2' $'3 1 9 7 2\n'
run_case $'5\n-3 -9 -1 -9 -3' $'-3 -1 -9 -9 -3\n'
run_case $'3\n7 7 7' $'7 7 7\n'
run_case $'2\n1 9' $'9 1\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
