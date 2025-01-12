// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetCloudwrapperConfigurationMultiCdnSettingsArgs : global::Pulumi.InvokeArgs
    {
        [Input("bocc")]
        public Inputs.GetCloudwrapperConfigurationMultiCdnSettingsBoccArgs? Bocc { get; set; }

        [Input("cdns")]
        private List<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsCdnArgs>? _cdns;
        public List<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsCdnArgs> Cdns
        {
            get => _cdns ?? (_cdns = new List<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsCdnArgs>());
            set => _cdns = value;
        }

        [Input("dataStreams")]
        public Inputs.GetCloudwrapperConfigurationMultiCdnSettingsDataStreamsArgs? DataStreams { get; set; }

        [Input("enableSoftAlerts", required: true)]
        public bool EnableSoftAlerts { get; set; }

        [Input("origins")]
        private List<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs>? _origins;
        public List<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs> Origins
        {
            get => _origins ?? (_origins = new List<Inputs.GetCloudwrapperConfigurationMultiCdnSettingsOriginArgs>());
            set => _origins = value;
        }

        public GetCloudwrapperConfigurationMultiCdnSettingsArgs()
        {
        }
        public static new GetCloudwrapperConfigurationMultiCdnSettingsArgs Empty => new GetCloudwrapperConfigurationMultiCdnSettingsArgs();
    }
}
