#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

printf 'alpha\nbeta\n' > /tmp/jt_src1.txt
run_case_args "/tmp/jt_src1.txt /tmp/jt_dst1.txt" "" $'Copied\n'
if cmp -s /tmp/jt_src1.txt /tmp/jt_dst1.txt; then
  echo "OK:   копия совпадает побайтово"
else
  echo "FAIL: копия не совпадает"
  FAILED=1
fi

run_case_args "/tmp/jt_src1.txt /tmp/jt_dst1.txt" "" $'Copied\n'

printf '' > /tmp/jt_src2.txt
run_case_args "/tmp/jt_src2.txt /tmp/jt_dst2.txt" "" $'Copied\n'
if cmp -s /tmp/jt_src2.txt /tmp/jt_dst2.txt; then
  echo "OK:   пустой файл скопирован"
else
  echo "FAIL: пустой файл"
  FAILED=1
fi

run_case_args "/tmp/jt_no_such_source.txt /tmp/jt_dst3.txt" "" $'Error: file not found\n'

rm -f /tmp/jt_src1.txt /tmp/jt_dst1.txt /tmp/jt_src2.txt /tmp/jt_dst2.txt /tmp/jt_dst3.txt

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
