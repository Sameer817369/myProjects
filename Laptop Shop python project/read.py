# the function reads laptop details from a text file and stores them in a dictionary
def items_info():
    file = open("Laptop_Details.txt", "r")
    items_dec = {}
    laptops_id = 1
    for i in file:
        i = i.replace("\n", "")
        items_dec.update({laptops_id: i.split(",")})
        laptops_id += 1
    file.close()
    return items_dec


# the function prints the laptop details in a tabular format
def items_table():
    print(
        "------------------------------------------------------------------------------------------------------------")
    print(
        "S.N.\tLaptop Name   	Company Name	 Price	  		    Processor		       Graphics             Price")
    print(
        "-------------------------------------------------------------------------------------------------------------")
    file = open("Laptop_Details.txt", "r")
    a = 1
    for details in file:
        print(" ", a, "    " + details.replace(",", "\t\t "))
        a = a + 1
    print(
        "-------------------------------------------------------------------------------------------------------------")
    file.close()
    print("\n")



items_info()
