// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryPolicyArgs : global::Pulumi.InvokeArgs
    {
        [Input("binaryEquivalentContent")]
        public bool? BinaryEquivalentContent { get; set; }

        [Input("enableIpAvoidance")]
        public bool? EnableIpAvoidance { get; set; }

        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("ipAvoidanceErrorThreshold")]
        public int? IpAvoidanceErrorThreshold { get; set; }

        [Input("ipAvoidanceRetryInterval")]
        public int? IpAvoidanceRetryInterval { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("monitorOriginResponsiveness")]
        public bool? MonitorOriginResponsiveness { get; set; }

        [Input("monitorResponseCodes1s")]
        private List<string>? _monitorResponseCodes1s;
        public List<string> MonitorResponseCodes1s
        {
            get => _monitorResponseCodes1s ?? (_monitorResponseCodes1s = new List<string>());
            set => _monitorResponseCodes1s = value;
        }

        [Input("monitorResponseCodes2s")]
        private List<string>? _monitorResponseCodes2s;
        public List<string> MonitorResponseCodes2s
        {
            get => _monitorResponseCodes2s ?? (_monitorResponseCodes2s = new List<string>());
            set => _monitorResponseCodes2s = value;
        }

        [Input("monitorResponseCodes3s")]
        private List<string>? _monitorResponseCodes3s;
        public List<string> MonitorResponseCodes3s
        {
            get => _monitorResponseCodes3s ?? (_monitorResponseCodes3s = new List<string>());
            set => _monitorResponseCodes3s = value;
        }

        [Input("monitorStatusCodes1")]
        public bool? MonitorStatusCodes1 { get; set; }

        [Input("monitorStatusCodes1EnableRecovery")]
        public bool? MonitorStatusCodes1EnableRecovery { get; set; }

        [Input("monitorStatusCodes1EnableRetry")]
        public bool? MonitorStatusCodes1EnableRetry { get; set; }

        [Input("monitorStatusCodes1RecoveryConfigName")]
        public string? MonitorStatusCodes1RecoveryConfigName { get; set; }

        [Input("monitorStatusCodes2")]
        public bool? MonitorStatusCodes2 { get; set; }

        [Input("monitorStatusCodes2EnableRecovery")]
        public bool? MonitorStatusCodes2EnableRecovery { get; set; }

        [Input("monitorStatusCodes2EnableRetry")]
        public bool? MonitorStatusCodes2EnableRetry { get; set; }

        [Input("monitorStatusCodes2RecoveryConfigName")]
        public string? MonitorStatusCodes2RecoveryConfigName { get; set; }

        [Input("monitorStatusCodes3")]
        public bool? MonitorStatusCodes3 { get; set; }

        [Input("monitorStatusCodes3EnableRecovery")]
        public bool? MonitorStatusCodes3EnableRecovery { get; set; }

        [Input("monitorStatusCodes3EnableRetry")]
        public bool? MonitorStatusCodes3EnableRetry { get; set; }

        [Input("monitorStatusCodes3RecoveryConfigName")]
        public string? MonitorStatusCodes3RecoveryConfigName { get; set; }

        [Input("originResponsivenessCustomTimeout")]
        public int? OriginResponsivenessCustomTimeout { get; set; }

        [Input("originResponsivenessEnableRecovery")]
        public bool? OriginResponsivenessEnableRecovery { get; set; }

        [Input("originResponsivenessEnableRetry")]
        public bool? OriginResponsivenessEnableRetry { get; set; }

        [Input("originResponsivenessMonitoring")]
        public string? OriginResponsivenessMonitoring { get; set; }

        [Input("originResponsivenessRecoveryConfigName")]
        public string? OriginResponsivenessRecoveryConfigName { get; set; }

        [Input("originResponsivenessTimeout")]
        public string? OriginResponsivenessTimeout { get; set; }

        [Input("statusCodeMonitoring1")]
        public string? StatusCodeMonitoring1 { get; set; }

        [Input("statusCodeMonitoring2")]
        public string? StatusCodeMonitoring2 { get; set; }

        [Input("statusCodeMonitoring3")]
        public string? StatusCodeMonitoring3 { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("tuningParameters")]
        public string? TuningParameters { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryPolicyArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryPolicyArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorOriginFailureRecoveryPolicyArgs();
    }
}