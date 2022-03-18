# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAppSecAdvancedSettingsPragmaHeaderResult',
    'AwaitableGetAppSecAdvancedSettingsPragmaHeaderResult',
    'get_app_sec_advanced_settings_pragma_header',
    'get_app_sec_advanced_settings_pragma_header_output',
]

@pulumi.output_type
class GetAppSecAdvancedSettingsPragmaHeaderResult:
    """
    A collection of values returned by getAppSecAdvancedSettingsPragmaHeader.
    """
    def __init__(__self__, config_id=None, id=None, json=None, output_text=None, security_policy_id=None):
        if config_id and not isinstance(config_id, int):
            raise TypeError("Expected argument 'config_id' to be a int")
        pulumi.set(__self__, "config_id", config_id)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if json and not isinstance(json, str):
            raise TypeError("Expected argument 'json' to be a str")
        pulumi.set(__self__, "json", json)
        if output_text and not isinstance(output_text, str):
            raise TypeError("Expected argument 'output_text' to be a str")
        pulumi.set(__self__, "output_text", output_text)
        if security_policy_id and not isinstance(security_policy_id, str):
            raise TypeError("Expected argument 'security_policy_id' to be a str")
        pulumi.set(__self__, "security_policy_id", security_policy_id)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> int:
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def json(self) -> str:
        return pulumi.get(self, "json")

    @property
    @pulumi.getter(name="outputText")
    def output_text(self) -> str:
        return pulumi.get(self, "output_text")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> Optional[str]:
        return pulumi.get(self, "security_policy_id")


class AwaitableGetAppSecAdvancedSettingsPragmaHeaderResult(GetAppSecAdvancedSettingsPragmaHeaderResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAppSecAdvancedSettingsPragmaHeaderResult(
            config_id=self.config_id,
            id=self.id,
            json=self.json,
            output_text=self.output_text,
            security_policy_id=self.security_policy_id)


def get_app_sec_advanced_settings_pragma_header(config_id: Optional[int] = None,
                                                security_policy_id: Optional[str] = None,
                                                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAppSecAdvancedSettingsPragmaHeaderResult:
    """
    **Scopes**: Security configuration; security policy

    Returns pragma header settings information. This HTTP header provides information about such things as: the edge routers used in a transaction; the Akamai IP addresses involved; information about whether a request was cached or not; and so on. By default, pragma headers are removed from all responses.

    Additional information is available from the [PragmaHeader members](https://developer.akamai.com/api/cloud_security/application_security/v1.html#64c92ba1) section of the Application Security API.

    **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/pragma-header](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getpragmaheaderconfiguration)

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Documentation")
    pragma_header = akamai.get_app_sec_advanced_settings_pragma_header(config_id=configuration.config_id)
    pulumi.export("advancedSettingsPragmaHeaderOutput", pragma_header.output_text)
    pulumi.export("advancedSettingsPragmaHeaderJson", pragma_header.json)
    policy_pragma_header = akamai.get_app_sec_advanced_settings_pragma_header(config_id=configuration.config_id,
        security_policy_id="gms1_134637")
    pulumi.export("advancedSettingsPolicyPragmaHeaderOutput", policy_pragma_header.output_text)
    pulumi.export("advancedSettingsPolicyPragmaHeaderJson", policy_pragma_header.json)
    ```
    ## Output Options

    The following options can be used to determine the information returned, and how that returned information is formatted:

    - `json`. JSON-formatted list of information about the pragma header settings.
    - `output_text`. Tabular report showing the pragma header settings.


    :param int config_id: . Unique identifier of the security configuration associated with the pragma header settings.
    :param str security_policy_id: . Unique identifier of the security policy associated with the pragma header settings. If not included, information is returned for all your security policies.
    """
    __args__ = dict()
    __args__['configId'] = config_id
    __args__['securityPolicyId'] = security_policy_id
    if opts is None:
        opts = pulumi.InvokeOptions()
    if opts.version is None:
        opts.version = _utilities.get_version()
    __ret__ = pulumi.runtime.invoke('akamai:index/getAppSecAdvancedSettingsPragmaHeader:getAppSecAdvancedSettingsPragmaHeader', __args__, opts=opts, typ=GetAppSecAdvancedSettingsPragmaHeaderResult).value

    return AwaitableGetAppSecAdvancedSettingsPragmaHeaderResult(
        config_id=__ret__.config_id,
        id=__ret__.id,
        json=__ret__.json,
        output_text=__ret__.output_text,
        security_policy_id=__ret__.security_policy_id)


@_utilities.lift_output_func(get_app_sec_advanced_settings_pragma_header)
def get_app_sec_advanced_settings_pragma_header_output(config_id: Optional[pulumi.Input[int]] = None,
                                                       security_policy_id: Optional[pulumi.Input[Optional[str]]] = None,
                                                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAppSecAdvancedSettingsPragmaHeaderResult]:
    """
    **Scopes**: Security configuration; security policy

    Returns pragma header settings information. This HTTP header provides information about such things as: the edge routers used in a transaction; the Akamai IP addresses involved; information about whether a request was cached or not; and so on. By default, pragma headers are removed from all responses.

    Additional information is available from the [PragmaHeader members](https://developer.akamai.com/api/cloud_security/application_security/v1.html#64c92ba1) section of the Application Security API.

    **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/advanced-settings/pragma-header](https://developer.akamai.com/api/cloud_security/application_security/v1.html#getpragmaheaderconfiguration)

    ## Example Usage

    Basic usage:

    ```python
    import pulumi
    import pulumi_akamai as akamai

    configuration = akamai.get_app_sec_configuration(name="Documentation")
    pragma_header = akamai.get_app_sec_advanced_settings_pragma_header(config_id=configuration.config_id)
    pulumi.export("advancedSettingsPragmaHeaderOutput", pragma_header.output_text)
    pulumi.export("advancedSettingsPragmaHeaderJson", pragma_header.json)
    policy_pragma_header = akamai.get_app_sec_advanced_settings_pragma_header(config_id=configuration.config_id,
        security_policy_id="gms1_134637")
    pulumi.export("advancedSettingsPolicyPragmaHeaderOutput", policy_pragma_header.output_text)
    pulumi.export("advancedSettingsPolicyPragmaHeaderJson", policy_pragma_header.json)
    ```
    ## Output Options

    The following options can be used to determine the information returned, and how that returned information is formatted:

    - `json`. JSON-formatted list of information about the pragma header settings.
    - `output_text`. Tabular report showing the pragma header settings.


    :param int config_id: . Unique identifier of the security configuration associated with the pragma header settings.
    :param str security_policy_id: . Unique identifier of the security policy associated with the pragma header settings. If not included, information is returned for all your security policies.
    """
    ...