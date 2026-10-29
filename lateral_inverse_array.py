def reverse_of_arrays(array):

    for count in range(len(array)):

        for counter in range(len(array[count]) // 2):

            temp = array[count][counter]

            array[count][counter] = array[count][len(array[count]) - 1 - counter]

            array[count][len(array[count]) - 1 - counter] = temp

    return array


array_one = [
                [1, 2, 3],
                [4, 5, 6],
                [7, 8, 9]
                            ]

array_two = [
                [8, 6],
                [2, 4, 5],
                [3],
                [1, 4, 2, 8]
                                ]


print(reverse_of_arrays(array_one))
print(reverse_of_arrays(array_two))






