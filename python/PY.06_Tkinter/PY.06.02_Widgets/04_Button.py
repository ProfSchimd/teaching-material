from tkinter import *
import tkinter.ttk as ttk
import webbrowser

class UI(Tk):
    
    def __init__(self):
        super().__init__()
        self.build()
        
    def build(self):
        self.geometry("300x100")
        self.photo = PhotoImage(file = "cz.png")
        self.button = Button(self,image=self.photo, compound="left", command=self.go)

        # Pack the button
        self.button.pack(pady=20)
        
    def go(self):
        webbrowser.open("https://www.itiszuccante.edu.it")
        
def main():
    app = UI()
    app.mainloop()

if __name__ == "__main__":
    main()