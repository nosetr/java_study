# Liste von GIT-Commands

**https://gist.github.com/jexchan/2351996**

// create different ssh key according the article Mac Set-Up Git

ssh-keygen -t rsa -C "your_email@youremail.com"

// then, add these keys as following

$ ssh-add ~/.ssh/id_rsa_activehacker

// you can delete all cached keys before:

$ ssh-add -D

// finally, you can check your saved keys

$ ssh-add -l

---------------------------------------------------------------------

  863  ssh-add -D
  
  864  echo "# java_study" >> README.md
  
  865  git init
  
  866  git add .
  
  867  git commit -m "first commit"
  
  868  git branch -M main
  
  869  git remote add origin git@github.com:nosetr/java_study.git
  
  870  git push -u origin main
  
  871  chmod 600 ~/.ssh/config
  
  872  git push -u origin main
  
  873  git remote -v
  
  874  sudo nano ~/.ssh/config
  
  875  git push -u origin main
  
  876  git config core.sshCommand "ssh -i ~/.ssh/id_rsa_javastudium"
  
  877  git push -u origin main

---------------------------------------------------------------------
  
  **!!!! Wenn wir einen Ordner namens ".git" löschen, repository wird komplett gelösch und wir können erneut mit GIT anfangen**
  
  git status // Information über Zustand holen
  
  git add . // "." or <filename>

  git push // auf github oder ähnliches senden
  
  git remote -v // Information über repository, die hinzugefügt wurde
  
  git log // alle commits zeigen
  
  git remote set-url origin <Git-URL> // The command changes an existing remote repository URL with all aktived commits
  
---------------------------------------------------------------------
  ### BRANCH
---------------------------------------------------------------------
  
  git branch // Informaton über aktuelle branch
  
  git branch -M master // Aktuelle branch umbenenen
  
  git branch blabla // Neue branch namens "blabla" wird erstellt
  
  git checkout blabla // auf branch "blabla" rüber springen
  
  git log --oneline // Commits zeigen
  
  git log --oneline --all --graph
  
  git checkout 5c597df // auf commit mit hash "5c597df" rüber springen (files werden entsprechend geändert - "Zeitmachine")
  
---------------------------------------------------------------------
  ### Branch zusammenführen
---------------------------------------------------------------------

  git checkout main // von "blabla" auf "main" gehen

  git merge blabla // "blabla" auf "main" koppeln

---------------------------------------------------------------
  ### Folder commit and push
---------------------------------------------------------------------

  git add <FOLDER-NAME> // Ganze Ordner mit Files zugeben (muss nicht leer sein)

  git commit -m "add folder commit"
  
  
  
  

