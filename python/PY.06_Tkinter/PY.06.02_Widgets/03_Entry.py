from tkinter import *  # noqa: F403
from tkinter import ttk

class UI(Tk):
    def __init__(self, title=""):
        super().__init__()
        self.title(title)
        self.build()
        
    def build(self):
        self.build_model()
        self.build_widgets()
        
    def build_model(self):
        self.name_var = StringVar(self, "Unnamed")
        
    def build_widgets(self):
        self.name_label = ttk.Label(self, textvariable=self.name_var)
        self.name_label.pack() 
        self.name_entry = ttk.Entry(self)
        self.name_entry.pack()
        self.set_name_button = ttk.Button(self, text="Set name", command=self.set_name)
        self.set_name_button.pack()
        
    def set_name(self):
        name = self.name_entry.get()
        if name:
            self.name_var.set(name)
        
        

def main():
    ui = UI("Entry Widget!")
    ui.mainloop()

if __name__ == "__main__":
    main()
    