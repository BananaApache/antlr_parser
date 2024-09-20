
from colorama import Fore as F
import subprocess
import os

# testfile = "testfiles/PUZ001+1.p"

# print("\nChoose which parser you want to test:\n1: geoff's TPTP\n2: our TPTPv9\n")
# inp = input("(1 or 2): ")

# if inp == "1":
#     output = subprocess.check_output(f"java -jar antlr-4.13.2-complete.jar -o OriginalParser g4/TPTP.g4; cd OriginalParser/g4; javac *.java;  java org.antlr.v4.gui.TestRig TPTP tptp_file ../../{testfile}; cd ../../", 
#                                  shell=True,
#                                  text=True,
#                                  stderr=subprocess.STDOUT)
# elif inp == "2":
#     output = subprocess.check_output(f"java -jar antlr-4.13.2-complete.jar -o JavaParser g4/TPTPv9.g4; cd JavaParser/g4; javac *.java;  java org.antlr.v4.gui.TestRig TPTPv9 tptp_file ../../{testfile}; cd ../../", 
#                                     shell=True,
#                                     text=True,
#                                     stderr=subprocess.STDOUT)
    
# print(output)
    
    
    
for file in os.listdir("testfiles/SYN/"):
    if file.startswith("SYN000"):
        testfile = f"testfiles/SYN/{file}"
        
        output = subprocess.check_output(f"cd JavaParser/g4; java org.antlr.v4.gui.TestRig TPTPv9 tptp_file ../../{testfile}; cd ../../", 
                                        shell=True,
                                        text=True,
                                        stderr=subprocess.STDOUT)

        for line in output.split("\n"):
            if line.startswith("line"):
                print(F.RED + "PROBLEM IN " + file + F.RESET)
                break
                        
