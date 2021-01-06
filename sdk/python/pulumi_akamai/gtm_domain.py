# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from . import _utilities, _tables

__all__ = ['GtmDomain']


class GtmDomain(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 cname_coalescing_enabled: Optional[pulumi.Input[bool]] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 contract: Optional[pulumi.Input[str]] = None,
                 default_error_penalty: Optional[pulumi.Input[int]] = None,
                 default_ssl_client_certificate: Optional[pulumi.Input[str]] = None,
                 default_ssl_client_private_key: Optional[pulumi.Input[str]] = None,
                 default_timeout_penalty: Optional[pulumi.Input[int]] = None,
                 email_notification_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 end_user_mapping_enabled: Optional[pulumi.Input[bool]] = None,
                 group: Optional[pulumi.Input[str]] = None,
                 load_feedback: Optional[pulumi.Input[bool]] = None,
                 load_imbalance_percentage: Optional[pulumi.Input[float]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 wait_on_complete: Optional[pulumi.Input[bool]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        `GtmDomain` provides the resource for creating, configuring and importing a gtm domain to integrate easily with your existing GTM infrastructure to provide a secure, high performance, highly available and scalable solution for Global Traffic Management. Note: Import requires an ID of the format: `existing_domain_name`

        ## Example Usage

        Basic usage:

        ```python
        import pulumi
        import pulumi_akamai as akamai

        demodomain = akamai.GtmDomain("demodomain",
            comment="some comment",
            contract="XXX",
            group="100",
            type="basic")
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: A descriptive comment
        :param pulumi.Input[str] contract: The contract ID (if creating domain)
        :param pulumi.Input[int] default_timeout_penalty: * `load_imbalance_percentage`
               * `default_ssl_client_private_key`
        :param pulumi.Input[str] group: The currently selected group ID (if creating domain)
        :param pulumi.Input[bool] load_feedback: * `default_ssl_client_certificate`
        :param pulumi.Input[str] name: Domain name
        :param pulumi.Input[str] type: Domain type
        :param pulumi.Input[bool] wait_on_complete: Wait for transaction to complete
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['cname_coalescing_enabled'] = cname_coalescing_enabled
            __props__['comment'] = comment
            __props__['contract'] = contract
            __props__['default_error_penalty'] = default_error_penalty
            __props__['default_ssl_client_certificate'] = default_ssl_client_certificate
            __props__['default_ssl_client_private_key'] = default_ssl_client_private_key
            __props__['default_timeout_penalty'] = default_timeout_penalty
            __props__['email_notification_lists'] = email_notification_lists
            __props__['end_user_mapping_enabled'] = end_user_mapping_enabled
            __props__['group'] = group
            __props__['load_feedback'] = load_feedback
            __props__['load_imbalance_percentage'] = load_imbalance_percentage
            __props__['name'] = name
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['wait_on_complete'] = wait_on_complete
            __props__['default_health_max'] = None
            __props__['default_health_multiplier'] = None
            __props__['default_health_threshold'] = None
            __props__['default_max_unreachable_penalty'] = None
            __props__['default_unreachable_threshold'] = None
            __props__['map_update_interval'] = None
            __props__['max_properties'] = None
            __props__['max_resources'] = None
            __props__['max_test_timeout'] = None
            __props__['max_ttl'] = None
            __props__['min_pingable_region_fraction'] = None
            __props__['min_test_interval'] = None
            __props__['min_ttl'] = None
            __props__['ping_interval'] = None
            __props__['ping_packet_size'] = None
            __props__['round_robin_prefix'] = None
            __props__['servermonitor_liveness_count'] = None
            __props__['servermonitor_load_count'] = None
            __props__['servermonitor_pool'] = None
        alias_opts = pulumi.ResourceOptions(aliases=[pulumi.Alias(type_="akamai:trafficmanagement/gtmDomain:GtmDomain")])
        opts = pulumi.ResourceOptions.merge(opts, alias_opts)
        super(GtmDomain, __self__).__init__(
            'akamai:index/gtmDomain:GtmDomain',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            cname_coalescing_enabled: Optional[pulumi.Input[bool]] = None,
            comment: Optional[pulumi.Input[str]] = None,
            contract: Optional[pulumi.Input[str]] = None,
            default_error_penalty: Optional[pulumi.Input[int]] = None,
            default_health_max: Optional[pulumi.Input[float]] = None,
            default_health_multiplier: Optional[pulumi.Input[float]] = None,
            default_health_threshold: Optional[pulumi.Input[float]] = None,
            default_max_unreachable_penalty: Optional[pulumi.Input[int]] = None,
            default_ssl_client_certificate: Optional[pulumi.Input[str]] = None,
            default_ssl_client_private_key: Optional[pulumi.Input[str]] = None,
            default_timeout_penalty: Optional[pulumi.Input[int]] = None,
            default_unreachable_threshold: Optional[pulumi.Input[float]] = None,
            email_notification_lists: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            end_user_mapping_enabled: Optional[pulumi.Input[bool]] = None,
            group: Optional[pulumi.Input[str]] = None,
            load_feedback: Optional[pulumi.Input[bool]] = None,
            load_imbalance_percentage: Optional[pulumi.Input[float]] = None,
            map_update_interval: Optional[pulumi.Input[int]] = None,
            max_properties: Optional[pulumi.Input[int]] = None,
            max_resources: Optional[pulumi.Input[int]] = None,
            max_test_timeout: Optional[pulumi.Input[float]] = None,
            max_ttl: Optional[pulumi.Input[int]] = None,
            min_pingable_region_fraction: Optional[pulumi.Input[float]] = None,
            min_test_interval: Optional[pulumi.Input[int]] = None,
            min_ttl: Optional[pulumi.Input[int]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ping_interval: Optional[pulumi.Input[int]] = None,
            ping_packet_size: Optional[pulumi.Input[int]] = None,
            round_robin_prefix: Optional[pulumi.Input[str]] = None,
            servermonitor_liveness_count: Optional[pulumi.Input[int]] = None,
            servermonitor_load_count: Optional[pulumi.Input[int]] = None,
            servermonitor_pool: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None,
            wait_on_complete: Optional[pulumi.Input[bool]] = None) -> 'GtmDomain':
        """
        Get an existing GtmDomain resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: A descriptive comment
        :param pulumi.Input[str] contract: The contract ID (if creating domain)
        :param pulumi.Input[int] default_timeout_penalty: * `load_imbalance_percentage`
               * `default_ssl_client_private_key`
        :param pulumi.Input[float] default_unreachable_threshold: * `min_pingable_region_fraction`
               * `servermonitor_liveness_count`
               * `round_robin_prefix`
               * `servermonitor_load_count`
               * `ping_interval`
               * `max_ttl`
               * `default_health_max`
               * `map_update_interval`
               * `max_properties`
               * `max_resources`
               * `default_error_penalty`
               * `max_test_timeout`
               * `default_health_multiplier`
               * `servermonitor_pool`
               * `min_ttl`
               * `default_max_unreachable_penalty`
               * `default_health_threshold`
               * `min_test_interval`
               * `ping_packet_size`
        :param pulumi.Input[str] group: The currently selected group ID (if creating domain)
        :param pulumi.Input[bool] load_feedback: * `default_ssl_client_certificate`
        :param pulumi.Input[str] name: Domain name
        :param pulumi.Input[str] type: Domain type
        :param pulumi.Input[bool] wait_on_complete: Wait for transaction to complete
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["cname_coalescing_enabled"] = cname_coalescing_enabled
        __props__["comment"] = comment
        __props__["contract"] = contract
        __props__["default_error_penalty"] = default_error_penalty
        __props__["default_health_max"] = default_health_max
        __props__["default_health_multiplier"] = default_health_multiplier
        __props__["default_health_threshold"] = default_health_threshold
        __props__["default_max_unreachable_penalty"] = default_max_unreachable_penalty
        __props__["default_ssl_client_certificate"] = default_ssl_client_certificate
        __props__["default_ssl_client_private_key"] = default_ssl_client_private_key
        __props__["default_timeout_penalty"] = default_timeout_penalty
        __props__["default_unreachable_threshold"] = default_unreachable_threshold
        __props__["email_notification_lists"] = email_notification_lists
        __props__["end_user_mapping_enabled"] = end_user_mapping_enabled
        __props__["group"] = group
        __props__["load_feedback"] = load_feedback
        __props__["load_imbalance_percentage"] = load_imbalance_percentage
        __props__["map_update_interval"] = map_update_interval
        __props__["max_properties"] = max_properties
        __props__["max_resources"] = max_resources
        __props__["max_test_timeout"] = max_test_timeout
        __props__["max_ttl"] = max_ttl
        __props__["min_pingable_region_fraction"] = min_pingable_region_fraction
        __props__["min_test_interval"] = min_test_interval
        __props__["min_ttl"] = min_ttl
        __props__["name"] = name
        __props__["ping_interval"] = ping_interval
        __props__["ping_packet_size"] = ping_packet_size
        __props__["round_robin_prefix"] = round_robin_prefix
        __props__["servermonitor_liveness_count"] = servermonitor_liveness_count
        __props__["servermonitor_load_count"] = servermonitor_load_count
        __props__["servermonitor_pool"] = servermonitor_pool
        __props__["type"] = type
        __props__["wait_on_complete"] = wait_on_complete
        return GtmDomain(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="cnameCoalescingEnabled")
    def cname_coalescing_enabled(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "cname_coalescing_enabled")

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        A descriptive comment
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def contract(self) -> pulumi.Output[Optional[str]]:
        """
        The contract ID (if creating domain)
        """
        return pulumi.get(self, "contract")

    @property
    @pulumi.getter(name="defaultErrorPenalty")
    def default_error_penalty(self) -> pulumi.Output[Optional[int]]:
        return pulumi.get(self, "default_error_penalty")

    @property
    @pulumi.getter(name="defaultHealthMax")
    def default_health_max(self) -> pulumi.Output[float]:
        return pulumi.get(self, "default_health_max")

    @property
    @pulumi.getter(name="defaultHealthMultiplier")
    def default_health_multiplier(self) -> pulumi.Output[float]:
        return pulumi.get(self, "default_health_multiplier")

    @property
    @pulumi.getter(name="defaultHealthThreshold")
    def default_health_threshold(self) -> pulumi.Output[float]:
        return pulumi.get(self, "default_health_threshold")

    @property
    @pulumi.getter(name="defaultMaxUnreachablePenalty")
    def default_max_unreachable_penalty(self) -> pulumi.Output[int]:
        return pulumi.get(self, "default_max_unreachable_penalty")

    @property
    @pulumi.getter(name="defaultSslClientCertificate")
    def default_ssl_client_certificate(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "default_ssl_client_certificate")

    @property
    @pulumi.getter(name="defaultSslClientPrivateKey")
    def default_ssl_client_private_key(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "default_ssl_client_private_key")

    @property
    @pulumi.getter(name="defaultTimeoutPenalty")
    def default_timeout_penalty(self) -> pulumi.Output[Optional[int]]:
        """
        * `load_imbalance_percentage`
        * `default_ssl_client_private_key`
        """
        return pulumi.get(self, "default_timeout_penalty")

    @property
    @pulumi.getter(name="defaultUnreachableThreshold")
    def default_unreachable_threshold(self) -> pulumi.Output[float]:
        """
        * `min_pingable_region_fraction`
        * `servermonitor_liveness_count`
        * `round_robin_prefix`
        * `servermonitor_load_count`
        * `ping_interval`
        * `max_ttl`
        * `default_health_max`
        * `map_update_interval`
        * `max_properties`
        * `max_resources`
        * `default_error_penalty`
        * `max_test_timeout`
        * `default_health_multiplier`
        * `servermonitor_pool`
        * `min_ttl`
        * `default_max_unreachable_penalty`
        * `default_health_threshold`
        * `min_test_interval`
        * `ping_packet_size`
        """
        return pulumi.get(self, "default_unreachable_threshold")

    @property
    @pulumi.getter(name="emailNotificationLists")
    def email_notification_lists(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "email_notification_lists")

    @property
    @pulumi.getter(name="endUserMappingEnabled")
    def end_user_mapping_enabled(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "end_user_mapping_enabled")

    @property
    @pulumi.getter
    def group(self) -> pulumi.Output[Optional[str]]:
        """
        The currently selected group ID (if creating domain)
        """
        return pulumi.get(self, "group")

    @property
    @pulumi.getter(name="loadFeedback")
    def load_feedback(self) -> pulumi.Output[Optional[bool]]:
        """
        * `default_ssl_client_certificate`
        """
        return pulumi.get(self, "load_feedback")

    @property
    @pulumi.getter(name="loadImbalancePercentage")
    def load_imbalance_percentage(self) -> pulumi.Output[Optional[float]]:
        return pulumi.get(self, "load_imbalance_percentage")

    @property
    @pulumi.getter(name="mapUpdateInterval")
    def map_update_interval(self) -> pulumi.Output[int]:
        return pulumi.get(self, "map_update_interval")

    @property
    @pulumi.getter(name="maxProperties")
    def max_properties(self) -> pulumi.Output[int]:
        return pulumi.get(self, "max_properties")

    @property
    @pulumi.getter(name="maxResources")
    def max_resources(self) -> pulumi.Output[int]:
        return pulumi.get(self, "max_resources")

    @property
    @pulumi.getter(name="maxTestTimeout")
    def max_test_timeout(self) -> pulumi.Output[float]:
        return pulumi.get(self, "max_test_timeout")

    @property
    @pulumi.getter(name="maxTtl")
    def max_ttl(self) -> pulumi.Output[int]:
        return pulumi.get(self, "max_ttl")

    @property
    @pulumi.getter(name="minPingableRegionFraction")
    def min_pingable_region_fraction(self) -> pulumi.Output[float]:
        return pulumi.get(self, "min_pingable_region_fraction")

    @property
    @pulumi.getter(name="minTestInterval")
    def min_test_interval(self) -> pulumi.Output[int]:
        return pulumi.get(self, "min_test_interval")

    @property
    @pulumi.getter(name="minTtl")
    def min_ttl(self) -> pulumi.Output[int]:
        return pulumi.get(self, "min_ttl")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Domain name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pingInterval")
    def ping_interval(self) -> pulumi.Output[int]:
        return pulumi.get(self, "ping_interval")

    @property
    @pulumi.getter(name="pingPacketSize")
    def ping_packet_size(self) -> pulumi.Output[int]:
        return pulumi.get(self, "ping_packet_size")

    @property
    @pulumi.getter(name="roundRobinPrefix")
    def round_robin_prefix(self) -> pulumi.Output[str]:
        return pulumi.get(self, "round_robin_prefix")

    @property
    @pulumi.getter(name="servermonitorLivenessCount")
    def servermonitor_liveness_count(self) -> pulumi.Output[int]:
        return pulumi.get(self, "servermonitor_liveness_count")

    @property
    @pulumi.getter(name="servermonitorLoadCount")
    def servermonitor_load_count(self) -> pulumi.Output[int]:
        return pulumi.get(self, "servermonitor_load_count")

    @property
    @pulumi.getter(name="servermonitorPool")
    def servermonitor_pool(self) -> pulumi.Output[str]:
        return pulumi.get(self, "servermonitor_pool")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        Domain type
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="waitOnComplete")
    def wait_on_complete(self) -> pulumi.Output[Optional[bool]]:
        """
        Wait for transaction to complete
        """
        return pulumi.get(self, "wait_on_complete")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop
