books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
temp = {}
if books.length == authors.length
    for i in 0...books.length do
        temp.store(books[i],authors[i])
    end
end
 p temp