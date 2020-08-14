
interface IInvoice{
	public void addExtension(String extType, InvoiceExtension newSnack);
	public InvoiceExtension getExtension(String extType);
	public void removeExtension(String extType);
}
