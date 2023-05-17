# Add talisman to install a pre-push hook in order to avoid pushing  sensitive data like passwords, secrets, etc
curl https://thoughtworks.github.io/talisman/install.sh > install-talisman.sh
chmod +x install-talisman.sh
sh install-talisman.sh
rm install-talisman.sh