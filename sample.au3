Run("F:\energia-0101E0014\energia.exe")

MouseMove(10, 100)
Sleep(4000)
Send("^o")
Sleep(2000)
Send("F:\hack_utd\Blink\Blink.ino")
Send("{TAB}")
Send("{ENTER}")
Sleep(1000)
Send("^u")
Sleep(10000)
Run("C:\Program Files (x86)\Eltima Software\RS232 Data Logger\DataLogger.exe")
Sleep(4000)
Send("{DOWN}")
Send("{DOWN}")
Send("{TAB}")
Send("F:\hack_utd\Blink\log.txt")
Send("{TAB}")
Send("{TAB}")
Send("{ENTER}")
Sleep(10000)
Send("{ENTER}")
Opt("WinTitleMatchMode", 2)
WinClose("RS232")
Send("{ENTER}")
WinClose("Energia")
WinClose("Energia")

#cs
Send("^M")
Sleep(5000)
Send("{TAB 2}")
Send("^a")
Send("^c")
Sleep(3000)
Run("Notepad.exe")
Sleep(2000)
Send("^v")
Sleep(1000)
Send("^s")
Sleep(1000)
Send("C:\Users\Arun\Downloads\energia-0101E0014-windows\energia-0101E0014\Blink\log.txt")
Send("{TAB 4}")
Send("{ENTER}")
#ce