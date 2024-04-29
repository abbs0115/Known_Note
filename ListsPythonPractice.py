#def p1(n):
   # for i in range(len(n) - 1):
        #if n[i] == 7 and n[i + 1] == 7:
            #return True
 #   return False

#print(p1([1,2,3,4,7,7]))

def p1(L):
    for i in tange(len(L)-1):
        if L[i] ==7:
            if L[i+1] == 7:
                return True
        return False

def p2(n):
    if n < 2:
        return False
    for i in range(2, n):
        if num % i == 0:
            return False
    return True

def sum_except_primes(nums):
    prime_count = 0
    total_sum = 0

    for num in numbers:
        if is_prime(num):
            prime_count += 1
        else:
            total_sum += num

        if prime_count == 5:
            break  

    return total_sum

def p3(n):
    total_sum = 0
    skip_section = False

    for num in n:
        if num == 2:
            skip_section = True
        if skip_section and num == 3:
            skip_section = False
        else:
            total_sum += num

    return total_sum

def main():

    myList = [2,4,5,6,6,7,7]
    print(p1(myList))

if __name__ == "main"
    main()
