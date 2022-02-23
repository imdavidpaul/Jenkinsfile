def newGit(repo)
{
git url '${repo}'
}
def newMaven()
{
sh 'mvn package'
}

