package prompto.store;

import java.util.function.Consumer;
import java.util.function.Supplier;

import prompto.error.PromptoError;

public interface IStorable {

	void setDbId(Object dbId);
	Object getOrCreateDbId();

	void clear();
	boolean isDirty();
	
	void setCategories(String[] categories) throws PromptoError;
	String[] getCategories();
	
	default void setData(String name, Object value) throws PromptoError {
		setData(name, value, null);
	}
	
	void setData(String name, Object value, IDbIdProvider provider) throws PromptoError;

	@FunctionalInterface
	public static interface IDbIdProvider extends Supplier<Object>  {}
	
	@FunctionalInterface
	public static interface IDbIdListener extends Consumer<Object> {}

}
