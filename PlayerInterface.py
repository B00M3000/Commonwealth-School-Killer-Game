import string
import random
import PySimpleGUI as sg



def open_window():
    layout = [[sg.Text("pass", key="new")]]
    window = sg.Window("Player Interface", layout, modal=True, size=(200,150))
    choice = None
    while True:
        event, values = window.read()
        if event == "Exit" or event == sg.WIN_CLOSED:
            break
        
    window.close()

def main():
    testtext = "hello"
    layout = [[sg.Button(testtext, key="open")]]
    window = sg.Window("Player Interface", layout, size=(200,150))
    while True:
        event, values = window.read()
        if event == "Exit" or event == sg.WIN_CLOSED:
            break
        if event == "open":
            open_window()
        
    window.close()

if __name__ == "__main__":
    main()