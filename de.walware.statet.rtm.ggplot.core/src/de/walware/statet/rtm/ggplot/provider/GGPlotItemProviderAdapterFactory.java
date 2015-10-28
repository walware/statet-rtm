/*=============================================================================#
 # Copyright (c) 2012-2015 Stephan Wahlbrink (WalWare.de) and others.
 # All rights reserved. This program and the accompanying materials
 # are made available under the terms of the Eclipse Public License v1.0
 # which accompanies this distribution, and is available at
 # http://www.eclipse.org/legal/epl-v10.html
 # 
 # Contributors:
 #     Stephan Wahlbrink - initial API and implementation
 #=============================================================================*/

package de.walware.statet.rtm.ggplot.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import de.walware.statet.rtm.ggplot.util.GGPlotAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GGPlotItemProviderAdapterFactory extends GGPlotAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes= new ArrayList<>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GGPlotItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GGPlot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GGPlotItemProvider ggPlotItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GGPlot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGGPlotAdapter() {
		if (ggPlotItemProvider == null) {
			ggPlotItemProvider = new GGPlotItemProvider(this);
		}

		return ggPlotItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomPointLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomPointLayerItemProvider geomPointLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomPointLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomPointLayerAdapter() {
		if (geomPointLayerItemProvider == null) {
			geomPointLayerItemProvider = new GeomPointLayerItemProvider(this);
		}

		return geomPointLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomBarLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomBarLayerItemProvider geomBarLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomBarLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomBarLayerAdapter() {
		if (geomBarLayerItemProvider == null) {
			geomBarLayerItemProvider = new GeomBarLayerItemProvider(this);
		}

		return geomBarLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomTextLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomTextLayerItemProvider geomTextLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomTextLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomTextLayerAdapter() {
		if (geomTextLayerItemProvider == null) {
			geomTextLayerItemProvider = new GeomTextLayerItemProvider(this);
		}

		return geomTextLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomSmoothLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomSmoothLayerItemProvider geomSmoothLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomSmoothLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomSmoothLayerAdapter() {
		if (geomSmoothLayerItemProvider == null) {
			geomSmoothLayerItemProvider = new GeomSmoothLayerItemProvider(this);
		}

		return geomSmoothLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomViolinLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomViolinLayerItemProvider geomViolinLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomViolinLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomViolinLayerAdapter() {
		if (geomViolinLayerItemProvider == null) {
			geomViolinLayerItemProvider = new GeomViolinLayerItemProvider(this);
		}

		return geomViolinLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GridFacetLayout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridFacetLayoutItemProvider gridFacetLayoutItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GridFacetLayout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGridFacetLayoutAdapter() {
		if (gridFacetLayoutItemProvider == null) {
			gridFacetLayoutItemProvider = new GridFacetLayoutItemProvider(this);
		}

		return gridFacetLayoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.WrapFacetLayout} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrapFacetLayoutItemProvider wrapFacetLayoutItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.WrapFacetLayout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWrapFacetLayoutAdapter() {
		if (wrapFacetLayoutItemProvider == null) {
			wrapFacetLayoutItemProvider = new WrapFacetLayoutItemProvider(this);
		}

		return wrapFacetLayoutItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.TextStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStyleItemProvider textStyleItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.TextStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTextStyleAdapter() {
		if (textStyleItemProvider == null) {
			textStyleItemProvider = new TextStyleItemProvider(this);
		}

		return textStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.IdentityStat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentityStatItemProvider identityStatItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.IdentityStat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentityStatAdapter() {
		if (identityStatItemProvider == null) {
			identityStatItemProvider = new IdentityStatItemProvider(this);
		}

		return identityStatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.SummaryStat} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SummaryStatItemProvider summaryStatItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.SummaryStat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSummaryStatAdapter() {
		if (summaryStatItemProvider == null) {
			summaryStatItemProvider = new SummaryStatItemProvider(this);
		}

		return summaryStatItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomBoxplotLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomBoxplotLayerItemProvider geomBoxplotLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomBoxplotLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomBoxplotLayerAdapter() {
		if (geomBoxplotLayerItemProvider == null) {
			geomBoxplotLayerItemProvider = new GeomBoxplotLayerItemProvider(this);
		}

		return geomBoxplotLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomHistogramLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomHistogramLayerItemProvider geomHistogramLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomHistogramLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomHistogramLayerAdapter() {
		if (geomHistogramLayerItemProvider == null) {
			geomHistogramLayerItemProvider = new GeomHistogramLayerItemProvider(this);
		}

		return geomHistogramLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomLineLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomLineLayerItemProvider geomLineLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomLineLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomLineLayerAdapter() {
		if (geomLineLayerItemProvider == null) {
			geomLineLayerItemProvider = new GeomLineLayerItemProvider(this);
		}

		return geomLineLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomAblineLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomAblineLayerItemProvider geomAblineLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomAblineLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomAblineLayerAdapter() {
		if (geomAblineLayerItemProvider == null) {
			geomAblineLayerItemProvider = new GeomAblineLayerItemProvider(this);
		}

		return geomAblineLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.walware.statet.rtm.ggplot.GeomTileLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeomTileLayerItemProvider geomTileLayerItemProvider;

	/**
	 * This creates an adapter for a {@link de.walware.statet.rtm.ggplot.GeomTileLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGeomTileLayerAdapter() {
		if (geomTileLayerItemProvider == null) {
			geomTileLayerItemProvider = new GeomTileLayerItemProvider(this);
		}

		return geomTileLayerItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void dispose() {
		if (ggPlotItemProvider != null) {
			ggPlotItemProvider.dispose();
		}
		if (geomAblineLayerItemProvider != null) {
			geomAblineLayerItemProvider.dispose();
		}
		if (geomBarLayerItemProvider != null) {
			geomBarLayerItemProvider.dispose();
		}
		if (geomBoxplotLayerItemProvider != null) {
			geomBoxplotLayerItemProvider.dispose();
		}
		if (geomHistogramLayerItemProvider != null) {
			geomHistogramLayerItemProvider.dispose();
		}
		if (geomLineLayerItemProvider != null) {
			geomLineLayerItemProvider.dispose();
		}
		if (geomPointLayerItemProvider != null) {
			geomPointLayerItemProvider.dispose();
		}
		if (geomTextLayerItemProvider != null) {
			geomTextLayerItemProvider.dispose();
		}
		if (geomSmoothLayerItemProvider != null) {
			geomSmoothLayerItemProvider.dispose();
		}
		if (geomTileLayerItemProvider != null) {
			geomTileLayerItemProvider.dispose();
		}
		if (geomViolinLayerItemProvider != null) {
			geomViolinLayerItemProvider.dispose();
		}
		if (gridFacetLayoutItemProvider != null) {
			gridFacetLayoutItemProvider.dispose();
		}
		if (wrapFacetLayoutItemProvider != null) {
			wrapFacetLayoutItemProvider.dispose();
		}
		if (identityStatItemProvider != null) {
			identityStatItemProvider.dispose();
		}
		if (summaryStatItemProvider != null) {
			summaryStatItemProvider.dispose();
		}
		if (textStyleItemProvider != null) {
			textStyleItemProvider.dispose();
		}
	}

}
