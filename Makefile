clean:
	mvn -q clean

package: clean
	mvn -q package

img: package
	docker build -t simple .

run: img
	docker run --rm -it simple these are the arguments