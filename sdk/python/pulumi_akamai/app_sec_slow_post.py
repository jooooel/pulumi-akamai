# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['AppSecSlowPostArgs', 'AppSecSlowPost']

@pulumi.input_type
class AppSecSlowPostArgs:
    def __init__(__self__, *,
                 config_id: pulumi.Input[int],
                 security_policy_id: pulumi.Input[str],
                 slow_rate_action: pulumi.Input[str],
                 duration_threshold_timeout: Optional[pulumi.Input[int]] = None,
                 slow_rate_threshold_period: Optional[pulumi.Input[int]] = None,
                 slow_rate_threshold_rate: Optional[pulumi.Input[int]] = None):
        """
        The set of arguments for constructing a AppSecSlowPost resource.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the slow POST settings being modified.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the slow POST settings being modified.
        :param pulumi.Input[str] slow_rate_action: . Action to be taken if slow POST protection is triggered. Allowed values are:
               - **alert**. Record the event.
               - **abort**. Block the request.
        :param pulumi.Input[int] duration_threshold_timeout: . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        :param pulumi.Input[int] slow_rate_threshold_period: . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        :param pulumi.Input[int] slow_rate_threshold_rate: . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        pulumi.set(__self__, "config_id", config_id)
        pulumi.set(__self__, "security_policy_id", security_policy_id)
        pulumi.set(__self__, "slow_rate_action", slow_rate_action)
        if duration_threshold_timeout is not None:
            pulumi.set(__self__, "duration_threshold_timeout", duration_threshold_timeout)
        if slow_rate_threshold_period is not None:
            pulumi.set(__self__, "slow_rate_threshold_period", slow_rate_threshold_period)
        if slow_rate_threshold_rate is not None:
            pulumi.set(__self__, "slow_rate_threshold_rate", slow_rate_threshold_rate)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Input[int]:
        """
        . Unique identifier of the security configuration associated with the slow POST settings being modified.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Input[str]:
        """
        . Unique identifier of the security policy associated with the slow POST settings being modified.
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "security_policy_id", value)

    @property
    @pulumi.getter(name="slowRateAction")
    def slow_rate_action(self) -> pulumi.Input[str]:
        """
        . Action to be taken if slow POST protection is triggered. Allowed values are:
        - **alert**. Record the event.
        - **abort**. Block the request.
        """
        return pulumi.get(self, "slow_rate_action")

    @slow_rate_action.setter
    def slow_rate_action(self, value: pulumi.Input[str]):
        pulumi.set(self, "slow_rate_action", value)

    @property
    @pulumi.getter(name="durationThresholdTimeout")
    def duration_threshold_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        """
        return pulumi.get(self, "duration_threshold_timeout")

    @duration_threshold_timeout.setter
    def duration_threshold_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_threshold_timeout", value)

    @property
    @pulumi.getter(name="slowRateThresholdPeriod")
    def slow_rate_threshold_period(self) -> Optional[pulumi.Input[int]]:
        """
        . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        """
        return pulumi.get(self, "slow_rate_threshold_period")

    @slow_rate_threshold_period.setter
    def slow_rate_threshold_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "slow_rate_threshold_period", value)

    @property
    @pulumi.getter(name="slowRateThresholdRate")
    def slow_rate_threshold_rate(self) -> Optional[pulumi.Input[int]]:
        """
        . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        return pulumi.get(self, "slow_rate_threshold_rate")

    @slow_rate_threshold_rate.setter
    def slow_rate_threshold_rate(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "slow_rate_threshold_rate", value)


@pulumi.input_type
class _AppSecSlowPostState:
    def __init__(__self__, *,
                 config_id: Optional[pulumi.Input[int]] = None,
                 duration_threshold_timeout: Optional[pulumi.Input[int]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 slow_rate_action: Optional[pulumi.Input[str]] = None,
                 slow_rate_threshold_period: Optional[pulumi.Input[int]] = None,
                 slow_rate_threshold_rate: Optional[pulumi.Input[int]] = None):
        """
        Input properties used for looking up and filtering AppSecSlowPost resources.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the slow POST settings being modified.
        :param pulumi.Input[int] duration_threshold_timeout: . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the slow POST settings being modified.
        :param pulumi.Input[str] slow_rate_action: . Action to be taken if slow POST protection is triggered. Allowed values are:
               - **alert**. Record the event.
               - **abort**. Block the request.
        :param pulumi.Input[int] slow_rate_threshold_period: . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        :param pulumi.Input[int] slow_rate_threshold_rate: . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        if config_id is not None:
            pulumi.set(__self__, "config_id", config_id)
        if duration_threshold_timeout is not None:
            pulumi.set(__self__, "duration_threshold_timeout", duration_threshold_timeout)
        if security_policy_id is not None:
            pulumi.set(__self__, "security_policy_id", security_policy_id)
        if slow_rate_action is not None:
            pulumi.set(__self__, "slow_rate_action", slow_rate_action)
        if slow_rate_threshold_period is not None:
            pulumi.set(__self__, "slow_rate_threshold_period", slow_rate_threshold_period)
        if slow_rate_threshold_rate is not None:
            pulumi.set(__self__, "slow_rate_threshold_rate", slow_rate_threshold_rate)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> Optional[pulumi.Input[int]]:
        """
        . Unique identifier of the security configuration associated with the slow POST settings being modified.
        """
        return pulumi.get(self, "config_id")

    @config_id.setter
    def config_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "config_id", value)

    @property
    @pulumi.getter(name="durationThresholdTimeout")
    def duration_threshold_timeout(self) -> Optional[pulumi.Input[int]]:
        """
        . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        """
        return pulumi.get(self, "duration_threshold_timeout")

    @duration_threshold_timeout.setter
    def duration_threshold_timeout(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "duration_threshold_timeout", value)

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> Optional[pulumi.Input[str]]:
        """
        . Unique identifier of the security policy associated with the slow POST settings being modified.
        """
        return pulumi.get(self, "security_policy_id")

    @security_policy_id.setter
    def security_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "security_policy_id", value)

    @property
    @pulumi.getter(name="slowRateAction")
    def slow_rate_action(self) -> Optional[pulumi.Input[str]]:
        """
        . Action to be taken if slow POST protection is triggered. Allowed values are:
        - **alert**. Record the event.
        - **abort**. Block the request.
        """
        return pulumi.get(self, "slow_rate_action")

    @slow_rate_action.setter
    def slow_rate_action(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slow_rate_action", value)

    @property
    @pulumi.getter(name="slowRateThresholdPeriod")
    def slow_rate_threshold_period(self) -> Optional[pulumi.Input[int]]:
        """
        . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        """
        return pulumi.get(self, "slow_rate_threshold_period")

    @slow_rate_threshold_period.setter
    def slow_rate_threshold_period(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "slow_rate_threshold_period", value)

    @property
    @pulumi.getter(name="slowRateThresholdRate")
    def slow_rate_threshold_rate(self) -> Optional[pulumi.Input[int]]:
        """
        . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        return pulumi.get(self, "slow_rate_threshold_rate")

    @slow_rate_threshold_rate.setter
    def slow_rate_threshold_rate(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "slow_rate_threshold_rate", value)


class AppSecSlowPost(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 duration_threshold_timeout: Optional[pulumi.Input[int]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 slow_rate_action: Optional[pulumi.Input[str]] = None,
                 slow_rate_threshold_period: Optional[pulumi.Input[int]] = None,
                 slow_rate_threshold_rate: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        """
        **Scopes**: Security policy

        Modifies slow POST protection settings for a security configuration and security policy. Slow POST protections help defend a site against attacks that try to tie up the site by using extremely slow requests and responses.

        **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/slow-post](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putslowpostprotectionsettings)

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name="Documentation")
        slow_post = akamai.AppSecSlowPost("slowPost",
            config_id=configuration.config_id,
            security_policy_id="gms1_134637",
            slow_rate_action="alert",
            slow_rate_threshold_rate=10,
            slow_rate_threshold_period=30,
            duration_threshold_timeout=20)
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the slow POST settings being modified.
        :param pulumi.Input[int] duration_threshold_timeout: . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the slow POST settings being modified.
        :param pulumi.Input[str] slow_rate_action: . Action to be taken if slow POST protection is triggered. Allowed values are:
               - **alert**. Record the event.
               - **abort**. Block the request.
        :param pulumi.Input[int] slow_rate_threshold_period: . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        :param pulumi.Input[int] slow_rate_threshold_rate: . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AppSecSlowPostArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        **Scopes**: Security policy

        Modifies slow POST protection settings for a security configuration and security policy. Slow POST protections help defend a site against attacks that try to tie up the site by using extremely slow requests and responses.

        **Related API Endpoint**: [/appsec/v1/configs/{configId}/versions/{versionNumber}/security-policies/{policyId}/slow-post](https://developer.akamai.com/api/cloud_security/application_security/v1.html#putslowpostprotectionsettings)

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        configuration = akamai.get_app_sec_configuration(name="Documentation")
        slow_post = akamai.AppSecSlowPost("slowPost",
            config_id=configuration.config_id,
            security_policy_id="gms1_134637",
            slow_rate_action="alert",
            slow_rate_threshold_rate=10,
            slow_rate_threshold_period=30,
            duration_threshold_timeout=20)
        ```

        :param str resource_name: The name of the resource.
        :param AppSecSlowPostArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AppSecSlowPostArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 config_id: Optional[pulumi.Input[int]] = None,
                 duration_threshold_timeout: Optional[pulumi.Input[int]] = None,
                 security_policy_id: Optional[pulumi.Input[str]] = None,
                 slow_rate_action: Optional[pulumi.Input[str]] = None,
                 slow_rate_threshold_period: Optional[pulumi.Input[int]] = None,
                 slow_rate_threshold_rate: Optional[pulumi.Input[int]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AppSecSlowPostArgs.__new__(AppSecSlowPostArgs)

            if config_id is None and not opts.urn:
                raise TypeError("Missing required property 'config_id'")
            __props__.__dict__["config_id"] = config_id
            __props__.__dict__["duration_threshold_timeout"] = duration_threshold_timeout
            if security_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'security_policy_id'")
            __props__.__dict__["security_policy_id"] = security_policy_id
            if slow_rate_action is None and not opts.urn:
                raise TypeError("Missing required property 'slow_rate_action'")
            __props__.__dict__["slow_rate_action"] = slow_rate_action
            __props__.__dict__["slow_rate_threshold_period"] = slow_rate_threshold_period
            __props__.__dict__["slow_rate_threshold_rate"] = slow_rate_threshold_rate
        super(AppSecSlowPost, __self__).__init__(
            'akamai:index/appSecSlowPost:AppSecSlowPost',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            config_id: Optional[pulumi.Input[int]] = None,
            duration_threshold_timeout: Optional[pulumi.Input[int]] = None,
            security_policy_id: Optional[pulumi.Input[str]] = None,
            slow_rate_action: Optional[pulumi.Input[str]] = None,
            slow_rate_threshold_period: Optional[pulumi.Input[int]] = None,
            slow_rate_threshold_rate: Optional[pulumi.Input[int]] = None) -> 'AppSecSlowPost':
        """
        Get an existing AppSecSlowPost resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] config_id: . Unique identifier of the security configuration associated with the slow POST settings being modified.
        :param pulumi.Input[int] duration_threshold_timeout: . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        :param pulumi.Input[str] security_policy_id: . Unique identifier of the security policy associated with the slow POST settings being modified.
        :param pulumi.Input[str] slow_rate_action: . Action to be taken if slow POST protection is triggered. Allowed values are:
               - **alert**. Record the event.
               - **abort**. Block the request.
        :param pulumi.Input[int] slow_rate_threshold_period: . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        :param pulumi.Input[int] slow_rate_threshold_rate: . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AppSecSlowPostState.__new__(_AppSecSlowPostState)

        __props__.__dict__["config_id"] = config_id
        __props__.__dict__["duration_threshold_timeout"] = duration_threshold_timeout
        __props__.__dict__["security_policy_id"] = security_policy_id
        __props__.__dict__["slow_rate_action"] = slow_rate_action
        __props__.__dict__["slow_rate_threshold_period"] = slow_rate_threshold_period
        __props__.__dict__["slow_rate_threshold_rate"] = slow_rate_threshold_rate
        return AppSecSlowPost(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="configId")
    def config_id(self) -> pulumi.Output[int]:
        """
        . Unique identifier of the security configuration associated with the slow POST settings being modified.
        """
        return pulumi.get(self, "config_id")

    @property
    @pulumi.getter(name="durationThresholdTimeout")
    def duration_threshold_timeout(self) -> pulumi.Output[Optional[int]]:
        """
        . Maximum amount of time (in seconds) that the first eight kilobytes of the POST body must be received in to avoid triggering the specified action.
        """
        return pulumi.get(self, "duration_threshold_timeout")

    @property
    @pulumi.getter(name="securityPolicyId")
    def security_policy_id(self) -> pulumi.Output[str]:
        """
        . Unique identifier of the security policy associated with the slow POST settings being modified.
        """
        return pulumi.get(self, "security_policy_id")

    @property
    @pulumi.getter(name="slowRateAction")
    def slow_rate_action(self) -> pulumi.Output[str]:
        """
        . Action to be taken if slow POST protection is triggered. Allowed values are:
        - **alert**. Record the event.
        - **abort**. Block the request.
        """
        return pulumi.get(self, "slow_rate_action")

    @property
    @pulumi.getter(name="slowRateThresholdPeriod")
    def slow_rate_threshold_period(self) -> pulumi.Output[Optional[int]]:
        """
        . Amount of time (in seconds) that the server should allow a request before marking the request as being too slow.
        """
        return pulumi.get(self, "slow_rate_threshold_period")

    @property
    @pulumi.getter(name="slowRateThresholdRate")
    def slow_rate_threshold_rate(self) -> pulumi.Output[Optional[int]]:
        """
        . Average rate (in bytes per second over the specified time period) allowed before the specified action is triggered.
        """
        return pulumi.get(self, "slow_rate_threshold_rate")
