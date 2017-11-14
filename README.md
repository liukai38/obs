# obs
1、创建文件夹把需要上传的项目代码copy到刚才创建的文件夹里，然后在空白处右键选择“git bash” ，弹出命令窗口
2、在命令窗口输入git init后与项目代码同级目录下会生成.git隐藏文件 
3、输入git add . （将改动添加到暂存区）
4、再输入git commit -m "提交说明" 
5、输入git remote add origin https://自己的仓库url地址（指定上传到哪个仓库） 
6、git push -u origin master 将本地更改推送到远程master分支。 这样你就完成了向远程仓库的推送。
