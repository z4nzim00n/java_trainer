#!/usr/bin/env bash
set -e
cd "$(dirname "$0")"
source ../../../scripts/lib.sh

compile

printf '1 2 3\n' > /tmp/jt_nums1.txt
run_case_args "/tmp/jt_nums1.txt" "" $'6\n'

printf '10 20 -5\n' > /tmp/jt_nums2.txt
run_case_args "/tmp/jt_nums2.txt" "" $'25\n'

printf '4\n5\n6\n' > /tmp/jt_nums3.txt
run_case_args "/tmp/jt_nums3.txt" "" $'15\n'

printf '' > /tmp/jt_nums4.txt
run_case_args "/tmp/jt_nums4.txt" "" $'0\n'

printf '0\n' > /tmp/jt_nums5.txt
run_case_args "/tmp/jt_nums5.txt" "" $'0\n'

rm -f /tmp/jt_nums1.txt /tmp/jt_nums2.txt /tmp/jt_nums3.txt /tmp/jt_nums4.txt /tmp/jt_nums5.txt

if [ -z "$FAILED" ]; then
  echo "Все тесты пройдены"
else
  echo "Есть проваленные тесты"
  exit 1
fi
