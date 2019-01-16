emulatorPara executar o Android Studio:
1. Acessar a pasta: ~/android-studio/bin
2. Comando: ./studio.h
------------------------------------------------------------------------------------------------------------------------

Para executar o emulador, depois de configurado:
1. Acessar a pasta: ~/Android/Sdk/tools
2. Para listar os emuladores configurados, digitar o comando: emulator -list-avds
3. Depois de identificar o emulador, digitar: emulator -avd NomeDoEmulador
Obs.: Por algum motivo a partir do antroid 27 dá problema na execução, utilizar as versões inferiores.

------------------------------------------------------------------------------------------------------------------------
Para instalar o Appium:

Depedências do Appium:
1. Digitar o comando:
	sudo apt-get install build-essential \
	curl git m4 ruby texinfo libbz2-dev \
	libcurl4-openssl-dev libexpat-dev libncurses-dev zlib1g-dev

Remover o nodejs e o npm:
2. Digitar o comando:

	sudo apt-get remove nodejs
	sudo apt-get remove npm

2.1 Instalar o nodejs de acordo com as intruções:
https://github.com/nodesource/distributions/blob/master/README.md

3. Vai exportar as variáveis de ambiente. Para isso:
3.1 Digitar o comando:
	sudo gedit ~/.bashrc

4. Instalar o npm:
Digitar o comando:
	sudo apt install npm
	npm install -g npm@4.0.5

5. Instalar o Appium:
Digitar o comando:
	npm install -g appium

------------------------------------------------------------------------------------------------------------------------
Para executar o uiatomator, deve ir na pasta:

    Android/Sdk/tools/bin, selecionar o arquivo exec, e selecionar executar por terminal

