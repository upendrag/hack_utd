@echo off
setlocal enableextensions enabledelayedexpansion
cd "F:\hack_utd\Blink"
curl -G http://env1-ev3ji3d7zp.elasticbeanstalk.com/labcloud/lab/registerdevice > tmp.txt
set /p device_id=<tmp.txt
:while1
	    echo %device_id%
	    curl -G http://env1-ev3ji3d7zp.elasticbeanstalk.com/labcloud/lab/getjob/%device_id% > Blink.ino
	    findstr /m "no_jobs" Blink.ino
		if %errorlevel% LEQ 0 (GOTO :nocode)
		sample.au3
	    for /f "tokens=* delims=" %%x in (log.txt) do (
			curl -d %%x -H "Content-Type:text/plain" http://env1-ev3ji3d7zp.elasticbeanstalk.com/labcloud/lab/postresult/%device_id%
			GOTO :nocode
			)
		:nocode
        timeout /t 15 /nobreak
        goto :while1
endlocal