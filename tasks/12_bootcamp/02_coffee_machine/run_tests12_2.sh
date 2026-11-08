#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

run_case "1" $'Cups: 2\nWater: 400 ml\nCoffee: 40 g\n'
run_case "3" $'Cups: 6\nWater: 1200 ml\nCoffee: 120 g\n'
run_case "0" $'Cups: 0\nWater: 0 ml\nCoffee: 0 g\n'
run_case "5" $'Cups: 10\nWater: 2000 ml\nCoffee: 200 g\n'

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
