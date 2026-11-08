#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case $'5\nbbb a cc dd e' $'a e cc dd bbb\n'
run_case $'3\napple fig kiwi' $'fig kiwi apple\n'
run_case $'4\nbb aa cc dd' $'aa bb cc dd\n'
run_case $'1\njava' $'java\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
