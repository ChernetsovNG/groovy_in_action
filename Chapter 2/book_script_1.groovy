class BookBean {
	String title
}

def groovyBook = new BookBean()

groovyBook.title = 'Groovy in Action'

assert groovyBook.getTitle() == 'Groovy in Action'
assert getTitleBackwards(groovyBook) == 'noitcA ni yvoorG'

String getTitleBackwards(book) {
	return book.title.reverse()
}