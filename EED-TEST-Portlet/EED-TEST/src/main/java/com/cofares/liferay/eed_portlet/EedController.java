package com.cofares.liferay.eed_portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller(value = "EedController")
@RequestMapping("VIEW")
public class EedController {
	
	@RenderMapping
	public ModelAndView view(RenderRequest request, RenderResponse response, ModelMap modelMap) 
			throws PortalException, SystemException {
		ModelAndView mav = new ModelAndView("view");
		
		System.out.println( "**** EedController.view(...)" );
		
//		PortletPreferences prefs = request.getPreferences();
//		modelMap.addAttribute(BuscadorHomeConstantes.PORTLET_PREFERENCES.ENLACE_FORM_CATALOGO, prefs.getValue(BuscadorHomeConstantes.PORTLET_PREFERENCES.ENLACE_FORM_CATALOGO, ""));
//		modelMap.addAttribute(BuscadorHomeConstantes.PORTLET_PREFERENCES.ENLACE_CATALOGO, prefs.getValue(BuscadorHomeConstantes.PORTLET_PREFERENCES.ENLACE_CATALOGO, ""));
//		modelMap.addAttribute(BuscadorHomeConstantes.PORTLET_PREFERENCES.ENLACE_FARLINE, prefs.getValue(BuscadorHomeConstantes.PORTLET_PREFERENCES.ENLACE_FARLINE, ""));
//		modelMap.addAttribute(BuscadorHomeConstantes.PORTLET_PREFERENCES.DESCUENTO_FARLINE_HABILITADO, prefs.getValue(BuscadorHomeConstantes.PORTLET_PREFERENCES.DESCUENTO_FARLINE_HABILITADO, ""));
//		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
//		String kunnr = (String) themeDisplay.getUser().getExpandoBridge().getAttribute(Constants.LIFERAY_USER_EXPANDO_FIELD.KUNNR);
//		List<Descuentos> lista = DescuentosLocalServiceUtil.findByKunnrTipo(kunnr, BuscadorHomeConstantes.TIPO_DESCUENTO_FARLINE);
//		boolean tieneDescuento = false;
//		if (lista != null && !lista.isEmpty()) {
//			Descuentos descuento = lista.get(0);
//			modelMap.addAttribute("valorDescuento", descuento.getValor());
//			modelMap.addAttribute("textoDescuento", descuento.getTexto());
//			tieneDescuento = true;
//		}
//		modelMap.addAttribute("tieneDescuento", tieneDescuento);
		return mav;
	}

}
