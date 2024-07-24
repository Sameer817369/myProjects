import operations
import read


# the function prints the shop information, including its name,location and phone number
def shop_info():
    print("\n")
    print("\n")
    print("-------------------------------------------------------------------------------------------------")
    print("\t\t\t Laptops Nepal")
    print("-------------------------------------------------------------------------------------------------")
    print("\n")
    print("-------------------------------------------------------------------------------------------------")
    print("\t\t\t Anamnagar;Kathmandu,|9812345678|")
    print("-------------------------------------------------------------------------------------------------")
    print("\n")

    print("-------------------------------------------------------------------------------------------------")
    print("\t\t\t Welcome to Laptops Nepal")
    print("-------------------------------------------------------------------------------------------------")
    print("\n")


shop_info()


# the function displays user options to buy or sell laptops or exit the program
def user_questions():
    print("\n")
    print("\n")
    print("What do you want to do?")
    print("-----------------------------------------------------------------------------------------------------")
    print("Press 1: For Sale")
    print("Press 2: For Purchase")
    print("press 3: To exit the program")
    print("-----------------------------------------------------------------------------------------------------")
    print("\n")


'''
the function ask user to enter a number to select the options from the menu.
The option are too sale, purchase or exit the program. The while loop makes sure
the user enter a valid number until entered. The program will run the corresponding
function based on the users input.
'''


def user_option():
    read.items_table()
    while True:
        user_questions()
        try:
            to_run_the_program = int(input("Enter the given number to continue"))
            if to_run_the_program == 1:
                operations.sale()
            elif to_run_the_program == 2:
                operations.purchase()
            elif to_run_the_program == 3:
                print("Thank you for using the program")
                break
            else:
                print("Invalid: Try again")
        except ValueError:
            print("Invalid: Try again")


user_option()
