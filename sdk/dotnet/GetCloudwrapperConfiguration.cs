// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai
{
    public static class GetCloudwrapperConfiguration
    {
        public static Task<GetCloudwrapperConfigurationResult> InvokeAsync(GetCloudwrapperConfigurationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCloudwrapperConfigurationResult>("akamai:index/getCloudwrapperConfiguration:getCloudwrapperConfiguration", args ?? new GetCloudwrapperConfigurationArgs(), options.WithDefaults());

        public static Output<GetCloudwrapperConfigurationResult> Invoke(GetCloudwrapperConfigurationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetCloudwrapperConfigurationResult>("akamai:index/getCloudwrapperConfiguration:getCloudwrapperConfiguration", args ?? new GetCloudwrapperConfigurationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetCloudwrapperConfigurationArgs : global::Pulumi.InvokeArgs
    {
        [Input("id", required: true)]
        public int Id { get; set; }

        [Input("locations")]
        private List<Inputs.GetCloudwrapperConfigurationLocationArgs>? _locations;
        public List<Inputs.GetCloudwrapperConfigurationLocationArgs> Locations
        {
            get => _locations ?? (_locations = new List<Inputs.GetCloudwrapperConfigurationLocationArgs>());
            set => _locations = value;
        }

        [Input("multiCdnSettings")]
        public Inputs.GetCloudwrapperConfigurationMultiCdnSettingsArgs? MultiCdnSettings { get; set; }

        public GetCloudwrapperConfigurationArgs()
        {
        }
        public static new GetCloudwrapperConfigurationArgs Empty => new GetCloudwrapperConfigurationArgs();
    }

    public sealed class GetCloudwrapperConfigurationInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("id", required: true)]
        public Input<int> Id { get; set; } = null!;

        [Input("locations")]
        private InputList<Inputs.GetCloudwrapperConfigurationLocationInputArgs>? _locations;
        public InputList<Inputs.GetCloudwrapperConfigurationLocationInputArgs> Locations
        {
            get => _locations ?? (_locations = new InputList<Inputs.GetCloudwrapperConfigurationLocationInputArgs>());
            set => _locations = value;
        }

        [Input("multiCdnSettings")]
        public Input<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsInputArgs>? MultiCdnSettings { get; set; }

        public GetCloudwrapperConfigurationInvokeArgs()
        {
        }
        public static new GetCloudwrapperConfigurationInvokeArgs Empty => new GetCloudwrapperConfigurationInvokeArgs();
    }


    [OutputType]
    public sealed class GetCloudwrapperConfigurationResult
    {
        public readonly int CapacityAlertsThreshold;
        public readonly string Comments;
        public readonly string ConfigName;
        public readonly string ContractId;
        public readonly int Id;
        public readonly string LastActivatedBy;
        public readonly string LastActivatedDate;
        public readonly string LastUpdatedBy;
        public readonly string LastUpdatedDate;
        public readonly ImmutableArray<Outputs.GetCloudwrapperConfigurationLocationResult> Locations;
        public readonly Outputs.GetCloudwrapperConfigurationMultiCdnSettingsResult? MultiCdnSettings;
        public readonly ImmutableArray<string> NotificationEmails;
        public readonly ImmutableArray<string> PropertyIds;
        public readonly bool RetainIdleObjects;
        public readonly string Status;

        [OutputConstructor]
        private GetCloudwrapperConfigurationResult(
            int capacityAlertsThreshold,

            string comments,

            string configName,

            string contractId,

            int id,

            string lastActivatedBy,

            string lastActivatedDate,

            string lastUpdatedBy,

            string lastUpdatedDate,

            ImmutableArray<Outputs.GetCloudwrapperConfigurationLocationResult> locations,

            Outputs.GetCloudwrapperConfigurationMultiCdnSettingsResult? multiCdnSettings,

            ImmutableArray<string> notificationEmails,

            ImmutableArray<string> propertyIds,

            bool retainIdleObjects,

            string status)
        {
            CapacityAlertsThreshold = capacityAlertsThreshold;
            Comments = comments;
            ConfigName = configName;
            ContractId = contractId;
            Id = id;
            LastActivatedBy = lastActivatedBy;
            LastActivatedDate = lastActivatedDate;
            LastUpdatedBy = lastUpdatedBy;
            LastUpdatedDate = lastUpdatedDate;
            Locations = locations;
            MultiCdnSettings = multiCdnSettings;
            NotificationEmails = notificationEmails;
            PropertyIds = propertyIds;
            RetainIdleObjects = retainIdleObjects;
            Status = status;
        }
    }
}