# .bashrc

# User specific aliases and functions

alias rm='rm -i'
alias cp='cp -i'
alias mv='mv -i'

# Source global definitions
if [ -f /etc/bashrc ]; then
	. /etc/bashrc
fi

export JAVA_HOME=/usr/java/jdk1.8.0_151/
export PATH=/usr/java/jdk1.8.0_151/bin:$PATH
export SPARK_HOME=/root/Downloads/spark/
export PATH=$SPARK_HOME/bin:$PATH
export HADOOP_HOME=/root/Downloads/hadoop/
export PATH=$HADOOP_HOME/bin/:$HADOOP_HOME/sbin/:$PATH
