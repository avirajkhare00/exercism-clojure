def armstrong_number(n):
  total_digits = len(str(n))
  total_sum = 0

  for i in str(n):
    total_sum += pow(int(i), total_digits)

  if total_sum == n:
    return True
  else:
    return False

print(armstrong_number(153))
print(armstrong_number(9))
print(armstrong_number(12))

def to_rna(s):

  result = ""

  transcoding = {
    "G": "C",
    "C": "G",
    "T": "A",
    "A": "U"
  }

  for i in s:
    try:
      result += transcoding[i]
    except KeyError as e:
      raise AssertionError

  return result

print(to_rna("A"))
print(to_rna("UGCACCAGAAUU"))
print(to_rna("XCGFGGTDTTAA"))